package com.algolia.search.client

import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.multipleindex.IndexQuery
import com.algolia.search.model.multipleindex.MultipleQueriesStrategy
import com.algolia.search.model.search.Query
import com.algolia.search.serialize.*
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import kotlinx.serialization.json.json
import kotlinx.serialization.json.jsonArray


internal fun HttpRequestBuilder.setApplicationId(applicationID: ApplicationID) {
    header(KeyAlgoliaApplicationID, applicationID.raw)
}

internal fun HttpRequestBuilder.setApiKey(apiKey: APIKey) {
    header(KeyAlgoliaAPIKey, apiKey.raw)
}

internal fun HttpRequestBuilder.setRequestOptions(requestOptions: RequestOptions?) {
    requestOptions?.headers?.forEach { header(it.key, it.value) }
    requestOptions?.urlParameters?.forEach { parameter(it.key, it.value) }
    requestOptions?.body?.let { body = it }
}

internal fun HttpRequestBuilder.setForwardToReplicas(forwardToReplicas: Boolean?) {
    forwardToReplicas?.let { parameter(KeyForwardToReplicas, it) }
}

internal fun HttpRequestBuilder.setQueries(queries: Collection<IndexQuery>, strategy: MultipleQueriesStrategy) {
    body = json {
        KeyRequests to jsonArray {
            queries.forEach {
                +json {
                    KeyIndexName to it.indexName.raw
                    KeyParams to it.query.toJsonNoDefaults().urlEncode()
                }
            }
        }
        KeyStrategy to strategy.raw
    }.toString()
}

internal fun HttpRequestBuilder.setBody(query: Query?) {
    body = query?.let { JsonNoNulls.stringify(Query.serializer(), it) } ?: "{}"
}
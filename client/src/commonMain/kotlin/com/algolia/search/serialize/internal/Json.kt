package com.algolia.search.serialize.internal

import com.algolia.search.model.indexing.DeleteByQuery
import com.algolia.search.model.internal.request.RequestAPIKey
import com.algolia.search.model.internal.request.RequestMultipleQueries
import com.algolia.search.model.multipleindex.IndexQuery
import com.algolia.search.model.multipleindex.MultipleQueriesStrategy
import com.algolia.search.model.search.Query
import com.algolia.search.model.settings.Settings
import io.ktor.http.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

internal val Json = Json {
    encodeDefaults = true
    ignoreUnknownKeys = true
}
internal val JsonNoDefaults = Json {
    ignoreUnknownKeys = true
}
internal val JsonNonStrict = Json {
    ignoreUnknownKeys = true
    isLenient = true
    allowSpecialFloatingPointValues = true
    encodeDefaults = true
}

@OptIn(ExperimentalSerializationApi::class)
internal val JsonDebug = Json {
    prettyPrint = true
    prettyPrintIndent = "  "
    encodeDefaults = false
}

internal fun JsonObject.merge(jsonObject: JsonObject): JsonObject {
    return toMutableMap().run {
        putAll(jsonObject)
        JsonObject(this)
    }
}

internal fun JsonObject.urlEncode(): String? {
    return if (isNotEmpty()) {
        Parameters.build {
            entries.forEach { (key, element) ->
                when (element) {
                    is JsonPrimitive -> {
                        append(key, sanitizeString(element.content))
                    }

                    else -> append(key, Json.encodeToString(JsonElement.serializer(), element))
                }
            }
        }.formUrlEncode()
    } else null
}

internal fun sanitizeString(input: String): String {
    return buildString {
        input.forEachIndexed { index, char ->
            val next = index + 1
            if (char.isHighSurrogate() && next < input.length && input[next].isLowSurrogate()) {
                append(char)
                append(input[next])
            } else if (!char.isSurrogate()) {
                append(char)
            }
        }
    }
}

internal fun Query.toJsonNoDefaults(): JsonObject {
    return JsonNoDefaults.encodeToJsonElement(Query.serializer(), this).jsonObject
}

internal fun DeleteByQuery.toJsonNoDefaults(): JsonObject {
    return JsonNoDefaults.encodeToJsonElement(DeleteByQuery.serializer(), this).jsonObject
}

internal fun Settings.toJsonNoDefaults(): JsonObject {
    return JsonNoDefaults.encodeToJsonElement(Settings.serializer(), this).jsonObject
}

internal fun RequestAPIKey.stringify(): String {
    return JsonNoDefaults.encodeToString(RequestAPIKey.serializer(), this)
}

internal fun List<IndexQuery>.toBody(strategy: MultipleQueriesStrategy?): String {
    return JsonNoDefaults.encodeToString(
        RequestMultipleQueries,
        RequestMultipleQueries(this, strategy)
    )
}

internal fun Query.toBody(): String {
    return JsonNoDefaults.encodeToString(Query.serializer(), this)
}

internal fun Decoder.asJsonDecoder() = this as JsonDecoder
internal fun Decoder.asJsonInput() = asJsonDecoder().decodeJsonElement()
internal fun Encoder.asJsonOutput() = this as JsonEncoder

/**
 * Convenience method to get current element as [JsonObject] or null.
 */
internal val JsonElement.jsonObjectOrNull: JsonObject?
    get() = this as? JsonObject

/**
 * Convenience method to get current element as [JsonArray] or null.
 */
internal val JsonElement.jsonArrayOrNull: JsonArray?
    get() = this as? JsonArray

/**
 * Convenience method to get current element as [JsonPrimitive] or null.
 */
internal val JsonElement.jsonPrimitiveOrNull: JsonPrimitive?
    get() = this as? JsonPrimitive

/**
 * Returns true if [JsonElement] is a string, false otherwise.
 */
internal val JsonElement.isString: Boolean
    get() = this is JsonPrimitive && isString

/**
 * Returns true if [JsonElement] is a [JsonArray], false otherwise.
 */
internal val JsonElement.isJsonArray: Boolean
    get() = this is JsonArray

/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.querysuggestions

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * BaseQuerySuggestionsConfigurationResponse
 *
 * @param appId Your Algolia application ID.
 * @param sourceIndicesAPIKey API key used to read from your source index.
 * @param suggestionsIndicesAPIKey API key used to write and configure your Query Suggestions index.
 * @param externalIndicesAPIKey API key used to read from external Algolia indices.
 */
@Serializable
public data class BaseQuerySuggestionsConfigurationResponse(

  /** Your Algolia application ID. */
  @SerialName(value = "appId") val appId: String? = null,

  /** API key used to read from your source index. */
  @SerialName(value = "sourceIndicesAPIKey") val sourceIndicesAPIKey: String? = null,

  /** API key used to write and configure your Query Suggestions index. */
  @SerialName(value = "suggestionsIndicesAPIKey") val suggestionsIndicesAPIKey: String? = null,

  /** API key used to read from external Algolia indices. */
  @SerialName(value = "externalIndicesAPIKey") val externalIndicesAPIKey: String? = null,
)
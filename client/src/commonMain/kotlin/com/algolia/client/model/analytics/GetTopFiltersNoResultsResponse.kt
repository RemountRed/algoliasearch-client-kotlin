/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetTopFiltersNoResultsResponse
 *
 * @param values Filters with no results.
 */
@Serializable
public data class GetTopFiltersNoResultsResponse(

  /** Filters with no results. */
  @SerialName(value = "values") val values: List<GetTopFiltersNoResultsValues>,
)

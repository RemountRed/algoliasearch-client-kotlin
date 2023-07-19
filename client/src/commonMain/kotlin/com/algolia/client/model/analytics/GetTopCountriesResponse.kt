/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetTopCountriesResponse
 *
 * @param countries Countries
 */
@Serializable
public data class GetTopCountriesResponse(

  /** Countries */
  @SerialName(value = "countries") val countries: List<TopCountry>,
)

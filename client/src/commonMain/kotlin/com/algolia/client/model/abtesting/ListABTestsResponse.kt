/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.abtesting

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * ListABTestsResponse
 *
 * @param abtests List of A/B tests.
 * @param count Number of A/B tests found for the app.
 * @param total Number of A/B tests retrievable.
 */
@Serializable
public data class ListABTestsResponse(

  /** List of A/B tests. */
  @SerialName(value = "abtests") val abtests: List<ABTest>,

  /** Number of A/B tests found for the app. */
  @SerialName(value = "count") val count: Int,

  /** Number of A/B tests retrievable. */
  @SerialName(value = "total") val total: Int,
)
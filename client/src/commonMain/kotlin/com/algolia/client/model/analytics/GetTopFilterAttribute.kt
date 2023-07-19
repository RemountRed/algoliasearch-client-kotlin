/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetTopFilterAttribute
 *
 * @param attribute Attribute name.
 * @param count Number of occurrences.
 */
@Serializable
public data class GetTopFilterAttribute(

  /** Attribute name. */
  @SerialName(value = "attribute") val attribute: String,

  /** Number of occurrences. */
  @SerialName(value = "count") val count: Int,
)

/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * A destination describe how the data is indexed on the Algolia side.
 *
 * @param destinationID The destination UUID.
 * @param type
 * @param name An human readable name describing the object.
 * @param input
 * @param createdAt Date of creation (RFC3339 format).
 * @param updatedAt Date of last update (RFC3339 format).
 * @param authenticationID
 */
@Serializable
public data class Destination(

  /** The destination UUID. */
  @SerialName(value = "destinationID") val destinationID: String,

  @SerialName(value = "type") val type: DestinationType,

  /** An human readable name describing the object. */
  @SerialName(value = "name") val name: String,

  @SerialName(value = "input") val input: DestinationInput,

  /** Date of creation (RFC3339 format). */
  @SerialName(value = "createdAt") val createdAt: String,

  /** Date of last update (RFC3339 format). */
  @SerialName(value = "updatedAt") val updatedAt: String? = null,

  @SerialName(value = "authenticationID") val authenticationID: String? = null,
)
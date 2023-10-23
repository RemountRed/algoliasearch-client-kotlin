/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * RunProgress
 *
 * @param expectedNbOfEvents
 * @param receivedNbOfEvents
 */
@Serializable
public data class RunProgress(

  @SerialName(value = "expectedNbOfEvents") val expectedNbOfEvents: Int? = null,

  @SerialName(value = "receivedNbOfEvents") val receivedNbOfEvents: Int? = null,
)
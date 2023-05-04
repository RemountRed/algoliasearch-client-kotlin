/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * UpdateModelParams
 *
 * @param name The model’s instance name.
 * @param modelAttributes
 * @param modelStatus
 */
@Serializable
public data class UpdateModelParams(

  /** The model’s instance name. */
  @SerialName(value = "name") val name: String? = null,

  @SerialName(value = "modelAttributes") val modelAttributes: List<String>? = null,

  @SerialName(value = "modelStatus") val modelStatus: ModelStatus? = null,
)

/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The error when the model is not available.
 *
 * @param error
 */
@Serializable
public data class Error(

  @SerialName(value = "error") val error: String,
) : PredictionsAffinities, PredictionsOrderValue, PredictionsFunnelStage

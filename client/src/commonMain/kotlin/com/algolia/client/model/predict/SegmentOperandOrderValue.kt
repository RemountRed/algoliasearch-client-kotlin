/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Operand for order value model predictions.
 *
 * @param name
 * @param filters
 */
@Serializable
public data class SegmentOperandOrderValue(

  @SerialName(value = "name") val name: String,

  @SerialName(value = "filters") val filters: List<SegmentOrderValueFilter>,
) : SegmentParentConditionOperands, SegmentChildConditionOperands

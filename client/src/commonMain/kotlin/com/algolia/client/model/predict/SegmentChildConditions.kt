/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Nested segment conditions that only contain operands.
 *
 * @param `operator`
 * @param operands
 */
@Serializable
public data class SegmentChildConditions(

  @SerialName(value = "operator") val `operator`: SegmentConditionOperator,

  @SerialName(value = "operands") val operands: List<SegmentChildConditionOperands>,
) : SegmentParentConditionOperands
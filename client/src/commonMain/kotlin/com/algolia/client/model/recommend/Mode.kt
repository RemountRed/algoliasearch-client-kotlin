/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * The search mode that the index will use to query for results.
 */
@Serializable
public enum class Mode(public val value: kotlin.String) {

  @SerialName(value = "neuralSearch")
  NeuralSearch("neuralSearch"),

  @SerialName(value = "keywordSearch")
  KeywordSearch("keywordSearch");

  override fun toString(): kotlin.String = value
}

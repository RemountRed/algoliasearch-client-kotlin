/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * Recommendation model.
 */
@Serializable
public enum class RecommendationModels(public val value: kotlin.String) {

  @SerialName(value = "related-products")
  RelatedProducts("related-products"),

  @SerialName(value = "bought-together")
  BoughtTogether("bought-together");

  override fun toString(): kotlin.String = value
}
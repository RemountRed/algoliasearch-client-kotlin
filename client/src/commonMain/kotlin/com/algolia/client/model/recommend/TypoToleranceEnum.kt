/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

@Serializable
public enum class TypoToleranceEnum(public val value: kotlin.String) : TypoTolerance {

  @SerialName(value = "min")
  Min("min"),

  @SerialName(value = "strict")
  Strict("strict");

  override fun toString(): kotlin.String = value
}

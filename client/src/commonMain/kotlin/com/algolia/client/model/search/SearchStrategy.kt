/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*

@Serializable
public enum class SearchStrategy(public val value: kotlin.String) {

  @SerialName(value = "none")
  None("none"),

  @SerialName(value = "stopIfEnoughMatches")
  StopIfEnoughMatches("stopIfEnoughMatches");

  override fun toString(): kotlin.String = value
}
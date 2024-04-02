/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*

/**
 * Which part of the search query the pattern should match:  - `startsWith`. The pattern must match the begginning of the query. - `endsWith`. The pattern must match the end of the query. - `is`. The pattern must match the query exactly. - `contains`. The pattern must match anywhere in the query.  Empty queries are only allowed as pattern with `anchoring: is`.
 */
@Serializable
public enum class Anchoring(public val value: kotlin.String) {

  @SerialName(value = "is")
  Is("is"),

  @SerialName(value = "startsWith")
  StartsWith("startsWith"),

  @SerialName(value = "endsWith")
  EndsWith("endsWith"),

  @SerialName(value = "contains")
  Contains("contains");

  override fun toString(): kotlin.String = value
}
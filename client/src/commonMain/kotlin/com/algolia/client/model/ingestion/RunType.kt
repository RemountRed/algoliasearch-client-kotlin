/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*

@Serializable
public enum class RunType(public val value: kotlin.String) {

  @SerialName(value = "reindex")
  Reindex("reindex"),

  @SerialName(value = "update")
  Update("update");

  override fun toString(): kotlin.String = value
}
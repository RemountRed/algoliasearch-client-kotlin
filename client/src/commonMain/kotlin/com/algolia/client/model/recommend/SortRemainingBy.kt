/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * Order of facet values that aren't explicitly positioned with the `order` setting.  <dl> <dt><code>count</code></dt> <dd> Order remaining facet values by decreasing count. The count is the number of matching records containing this facet value. </dd> <dt><code>alpha</code></dt> <dd>Sort facet values alphabetically.</dd> <dt><code>hidden</code></dt> <dd>Don't show facet values that aren't explicitly positioned.</dd> </dl>.
 */
@Serializable
public enum class SortRemainingBy(public val value: kotlin.String) {

  @SerialName(value = "count")
  Count("count"),

  @SerialName(value = "alpha")
  Alpha("alpha"),

  @SerialName(value = "hidden")
  Hidden("hidden");

  override fun toString(): kotlin.String = value
}
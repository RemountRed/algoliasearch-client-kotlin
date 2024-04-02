/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Effect of the rule.  For more information, see [Consequences](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/#consequences).
 *
 * @param params
 * @param promote Records you want to pin to a specific position in the search results.  You can promote up to 300 records, either individually, or as groups of up to 100 records each.
 * @param filterPromotes Whether promoted records must match an active filter for the consequence to be applied.  This ensures that user actions (filtering the search) are given a higher precendence. For example, if you promote a record with the `color: red` attribute, and the user filters the search for `color: blue`, the \"red\" record won't be shown.
 * @param hide Records you want to hide from the search results.
 * @param userData A JSON object with custom data that will be appended to the `userData` array in the response. This object isn't interpreted by the API and is limited to 1&nbsp;kB of minified JSON.
 */
@Serializable
public data class Consequence(

  @SerialName(value = "params") val params: ConsequenceParams? = null,

  /** Records you want to pin to a specific position in the search results.  You can promote up to 300 records, either individually, or as groups of up to 100 records each.  */
  @SerialName(value = "promote") val promote: List<Promote>? = null,

  /** Whether promoted records must match an active filter for the consequence to be applied.  This ensures that user actions (filtering the search) are given a higher precendence. For example, if you promote a record with the `color: red` attribute, and the user filters the search for `color: blue`, the \"red\" record won't be shown.  */
  @SerialName(value = "filterPromotes") val filterPromotes: Boolean? = null,

  /** Records you want to hide from the search results. */
  @SerialName(value = "hide") val hide: List<ConsequenceHide>? = null,

  /** A JSON object with custom data that will be appended to the `userData` array in the response. This object isn't interpreted by the API and is limited to 1&nbsp;kB of minified JSON.  */
  @SerialName(value = "userData") val userData: JsonElement? = null,
)
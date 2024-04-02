/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * ConsequenceQueryObject
 *
 * @param remove Words to remove from the search query.
 * @param edits Changes to make to the search query.
 */
@Serializable
public data class ConsequenceQueryObject(

  /** Words to remove from the search query. */
  @SerialName(value = "remove") val remove: List<String>? = null,

  /** Changes to make to the search query. */
  @SerialName(value = "edits") val edits: List<Edit>? = null,
) : ConsequenceQuery
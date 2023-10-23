/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * SearchResult
 *
 * Implementations:
 * - [SearchForFacetValuesResponse]
 * - [SearchResponse]
 */
@Serializable(SearchResultSerializer::class)
public sealed interface SearchResult {

  public companion object {
  }
}

internal class SearchResultSerializer : KSerializer<SearchResult> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("SearchResult")

  override fun serialize(encoder: Encoder, value: SearchResult) {
    when (value) {
      is SearchForFacetValuesResponse -> SearchForFacetValuesResponse.serializer().serialize(encoder, value)
      is SearchResponse -> SearchResponse.serializer().serialize(encoder, value)
    }
  }

  override fun deserialize(decoder: Decoder): SearchResult {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize SearchForFacetValuesResponse
    if (tree is JsonObject && tree.containsKey("facetHits")) {
      try {
        return codec.json.decodeFromJsonElement(SearchForFacetValuesResponse.serializer(), tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize SearchForFacetValuesResponse (error: ${e.message})")
      }
    }

    // deserialize SearchResponse
    if (tree is JsonObject) {
      try {
        return codec.json.decodeFromJsonElement(SearchResponse.serializer(), tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize SearchResponse (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}
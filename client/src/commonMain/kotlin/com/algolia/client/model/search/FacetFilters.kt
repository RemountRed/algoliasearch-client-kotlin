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
 * Filter hits by facet value.
 */
@Serializable(FacetFiltersSerializer::class)
public sealed interface FacetFilters {

  public data class ListOfMixedSearchFiltersWrapper(val value: List<MixedSearchFilters>) : FacetFilters

  public data class StringWrapper(val value: String) : FacetFilters

  public companion object {

    /**
     * FacetFilters as List<MixedSearchFilters>
     *
     */
    public fun ListOfMixedSearchFilters(
      value: List<MixedSearchFilters>,
    ): ListOfMixedSearchFiltersWrapper = ListOfMixedSearchFiltersWrapper(
      value = value,
    )

    /**
     * FacetFilters as String
     *
     */
    public fun String(
      value: String,
    ): StringWrapper = StringWrapper(
      value = value,
    )
  }
}

internal class FacetFiltersSerializer : KSerializer<FacetFilters> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("FacetFilters")

  override fun serialize(encoder: Encoder, value: FacetFilters) {
    when (value) {
      is FacetFilters.ListOfMixedSearchFiltersWrapper -> ListSerializer(MixedSearchFilters.serializer()).serialize(encoder, value.value)
      is FacetFilters.StringWrapper -> String.serializer().serialize(encoder, value.value)
    }
  }

  override fun deserialize(decoder: Decoder): FacetFilters {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize List<MixedSearchFilters>
    if (tree is JsonArray) {
      try {
        return codec.json.decodeFromJsonElement<FacetFilters.ListOfMixedSearchFiltersWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize List<MixedSearchFilters> (error: ${e.message})")
      }
    }

    // deserialize String
    if (tree is JsonPrimitive) {
      try {
        return codec.json.decodeFromJsonElement<FacetFilters.StringWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize String (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}

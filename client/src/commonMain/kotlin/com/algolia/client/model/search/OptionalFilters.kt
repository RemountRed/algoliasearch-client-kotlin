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
 * Create filters to boost or demote records.   Records that match the filter are ranked higher for positive and lower for negative optional filters. In contrast to regular filters, records that don't match the optional filter are still included in the results, only their ranking is affected.
 */
@Serializable(OptionalFiltersSerializer::class)
public sealed interface OptionalFilters {

  public data class ListOfMixedSearchFiltersWrapper(val value: List<MixedSearchFilters>) : OptionalFilters

  public data class StringWrapper(val value: String) : OptionalFilters

  public companion object {

    /**
     * OptionalFilters as List<MixedSearchFilters>
     *
     */
    public fun ListOfMixedSearchFilters(
      value: List<MixedSearchFilters>,
    ): ListOfMixedSearchFiltersWrapper = ListOfMixedSearchFiltersWrapper(
      value = value,
    )

    /**
     * OptionalFilters as String
     *
     */
    public fun String(
      value: String,
    ): StringWrapper = StringWrapper(
      value = value,
    )
  }
}

internal class OptionalFiltersSerializer : KSerializer<OptionalFilters> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("OptionalFilters")

  override fun serialize(encoder: Encoder, value: OptionalFilters) {
    when (value) {
      is OptionalFilters.ListOfMixedSearchFiltersWrapper -> ListSerializer(MixedSearchFilters.serializer()).serialize(encoder, value.value)
      is OptionalFilters.StringWrapper -> String.serializer().serialize(encoder, value.value)
    }
  }

  override fun deserialize(decoder: Decoder): OptionalFilters {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize List<MixedSearchFilters>
    if (tree is JsonArray) {
      try {
        return codec.json.decodeFromJsonElement<OptionalFilters.ListOfMixedSearchFiltersWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize List<MixedSearchFilters> (error: ${e.message})")
      }
    }

    // deserialize String
    if (tree is JsonPrimitive) {
      try {
        return codec.json.decodeFromJsonElement<OptionalFilters.StringWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize String (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}

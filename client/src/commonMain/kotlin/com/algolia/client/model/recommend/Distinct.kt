/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * Enables [deduplication or grouping of results (Algolia's _distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature)).
 */
@Serializable(DistinctSerializer::class)
public sealed interface Distinct {

  public data class BooleanWrapper(val value: Boolean) : Distinct

  public data class IntWrapper(val value: Int) : Distinct

  public companion object {

    /**
     * Distinct as Boolean
     *
     */
    public fun Boolean(
      value: Boolean,
    ): BooleanWrapper = BooleanWrapper(
      value = value,
    )

    /**
     * Distinct as Int
     *
     */
    public fun Number(
      value: Int,
    ): IntWrapper = IntWrapper(
      value = value,
    )
  }
}

internal class DistinctSerializer : KSerializer<Distinct> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Distinct")

  override fun serialize(encoder: Encoder, value: Distinct) {
    when (value) {
      is Distinct.BooleanWrapper -> Boolean.serializer().serialize(encoder, value.value)
      is Distinct.IntWrapper -> Int.serializer().serialize(encoder, value.value)
    }
  }

  override fun deserialize(decoder: Decoder): Distinct {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize Boolean
    if (tree is JsonPrimitive) {
      try {
        return codec.json.decodeFromJsonElement<Distinct.BooleanWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize Boolean (error: ${e.message})")
      }
    }

    // deserialize Int
    if (tree is JsonPrimitive) {
      try {
        return codec.json.decodeFromJsonElement<Distinct.IntWrapper>(tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize Int (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}

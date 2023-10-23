/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.insights

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * Absolute value of the discount in effect for this object, measured in `currency`.
 *
 * Implementations:
 * - [Double] - *[Discount.of]*
 * - [String] - *[Discount.of]*
 */
@Serializable(DiscountSerializer::class)
public sealed interface Discount {

  @JvmInline
  public value class DoubleValue(public val value: Double) : Discount

  @JvmInline
  public value class StringValue(public val value: String) : Discount

  public companion object {

    /** [Discount] as [Double] Value. */
    public fun of(value: Double): Discount {
      return DoubleValue(value)
    }

    /** [Discount] as [String] Value. */
    public fun of(value: String): Discount {
      return StringValue(value)
    }
  }
}

internal class DiscountSerializer : KSerializer<Discount> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Discount")

  override fun serialize(encoder: Encoder, value: Discount) {
    when (value) {
      is Discount.DoubleValue -> Double.serializer().serialize(encoder, value.value)
      is Discount.StringValue -> String.serializer().serialize(encoder, value.value)
    }
  }

  override fun deserialize(decoder: Decoder): Discount {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize Double
    if (tree is JsonPrimitive) {
      try {
        val value = codec.json.decodeFromJsonElement(Double.serializer(), tree)
        return Discount.of(value)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize Double (error: ${e.message})")
      }
    }

    // deserialize String
    if (tree is JsonPrimitive) {
      try {
        val value = codec.json.decodeFromJsonElement(String.serializer(), tree)
        return Discount.of(value)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize String (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}
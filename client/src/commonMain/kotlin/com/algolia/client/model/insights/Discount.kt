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
 * Absolute value of the discount for this product, in units of `currency`.
 *
 * Implementations:
 * - [Double] - *[Discount.of]*
 * - [String] - *[Discount.of]*
 */
@Serializable(DiscountSerializer::class)
public sealed interface Discount {
  @Serializable
  @JvmInline
  public value class DoubleValue(public val value: Double) : Discount

  @Serializable
  @JvmInline
  public value class StringValue(public val value: String) : Discount

  public companion object {

    public fun of(value: Double): Discount {
      return DoubleValue(value)
    }
    public fun of(value: String): Discount {
      return StringValue(value)
    }
  }
}

internal class DiscountSerializer : JsonContentPolymorphicSerializer<Discount>(Discount::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Discount> {
    return when {
      element.isDouble -> Discount.DoubleValue.serializer()
      element.isString -> Discount.StringValue.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
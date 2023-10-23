/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * AttributeToUpdate
 *
 * Implementations:
 * - [BuiltInOperation]
 * - [String] - *[AttributeToUpdate.of]*
 */
@Serializable(AttributeToUpdateSerializer::class)
public sealed interface AttributeToUpdate {

  @JvmInline
  public value class StringValue(public val value: String) : AttributeToUpdate

  public companion object {

    /** [AttributeToUpdate] as [String] Value. */
    public fun of(value: String): AttributeToUpdate {
      return StringValue(value)
    }
  }
}

internal class AttributeToUpdateSerializer : KSerializer<AttributeToUpdate> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("AttributeToUpdate")

  override fun serialize(encoder: Encoder, value: AttributeToUpdate) {
    when (value) {
      is BuiltInOperation -> BuiltInOperation.serializer().serialize(encoder, value)
      is AttributeToUpdate.StringValue -> String.serializer().serialize(encoder, value.value)
    }
  }

  override fun deserialize(decoder: Decoder): AttributeToUpdate {
    val codec = decoder.asJsonDecoder()
    val tree = codec.decodeJsonElement()

    // deserialize BuiltInOperation
    if (tree is JsonObject) {
      try {
        return codec.json.decodeFromJsonElement(BuiltInOperation.serializer(), tree)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize BuiltInOperation (error: ${e.message})")
      }
    }

    // deserialize String
    if (tree is JsonPrimitive) {
      try {
        val value = codec.json.decodeFromJsonElement(String.serializer(), tree)
        return AttributeToUpdate.of(value)
      } catch (e: Exception) {
        // deserialization failed, continue
        println("Failed to deserialize String (error: ${e.message})")
      }
    }

    throw AlgoliaClientException("Failed to deserialize json element: $tree")
  }
}
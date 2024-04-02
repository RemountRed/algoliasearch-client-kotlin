/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * Configuration of the task, depending on its type.
 *
 * Implementations:
 * - [OnDemandDateUtilsInput]
 * - [ScheduleDateUtilsInput]
 * - [StreamingUtilsInput]
 */
@Serializable(TaskInputSerializer::class)
public sealed interface TaskInput {

  public companion object {
  }
}

internal class TaskInputSerializer : JsonContentPolymorphicSerializer<TaskInput>(TaskInput::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<TaskInput> {
    return when {
      element is JsonObject -> OnDemandDateUtilsInput.serializer()
      element is JsonObject -> ScheduleDateUtilsInput.serializer()
      element is JsonObject -> StreamingUtilsInput.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
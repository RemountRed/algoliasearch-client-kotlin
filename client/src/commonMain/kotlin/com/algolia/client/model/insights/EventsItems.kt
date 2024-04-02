/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.insights

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * EventsItems
 *
 * Implementations:
 * - [AddedToCartObjectIDsAfterSearch]
 * - [PurchasedObjectIDsAfterSearch]
 * - [AddedToCartObjectIDs]
 * - [ClickedObjectIDsAfterSearch]
 * - [PurchasedObjectIDs]
 * - [ClickedFilters]
 * - [ClickedObjectIDs]
 * - [ConvertedFilters]
 * - [ConvertedObjectIDs]
 * - [ConvertedObjectIDsAfterSearch]
 * - [ViewedFilters]
 * - [ViewedObjectIDs]
 */
@Serializable(EventsItemsSerializer::class)
public sealed interface EventsItems {

  public companion object {
  }
}

internal class EventsItemsSerializer : JsonContentPolymorphicSerializer<EventsItems>(EventsItems::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<EventsItems> {
    return when {
      element is JsonObject && element.containsKey("positions") && element.containsKey("queryID") && element.containsKey("eventType") -> ClickedObjectIDsAfterSearch.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("eventSubtype") && element.containsKey("queryID") && element.containsKey("objectIDs") -> AddedToCartObjectIDsAfterSearch.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("eventSubtype") && element.containsKey("objectIDs") && element.containsKey("objectData") -> PurchasedObjectIDsAfterSearch.serializer()
      element is JsonObject && element.containsKey("queryID") && element.containsKey("eventType") -> ConvertedObjectIDsAfterSearch.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("objectIDs") -> ClickedObjectIDs.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("eventSubtype") && element.containsKey("objectIDs") -> PurchasedObjectIDs.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("eventSubtype") && element.containsKey("objectIDs") -> AddedToCartObjectIDs.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("objectIDs") -> ConvertedObjectIDs.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("filters") -> ClickedFilters.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("filters") -> ConvertedFilters.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("objectIDs") -> ViewedObjectIDs.serializer()
      element is JsonObject && element.containsKey("eventType") && element.containsKey("filters") -> ViewedFilters.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
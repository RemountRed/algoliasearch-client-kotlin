/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * Filter by numeric facets.  **Prefer using the `filters` parameter, which supports all filter types and combinations with boolean operators.**  You can use numeric comparison operators: `<`, `<=`, `=`, `!=`, `>`, `>=`. Comparsions are precise up to 3 decimals. You can also provide ranges: `facet:<lower> TO <upper>`. The range includes the lower and upper boundaries. The same combination rules apply as for `facetFilters`.
 *
 * Implementations:
 * - [List<MixedSearchFilters>] - *[NumericFilters.of]*
 * - [String] - *[NumericFilters.of]*
 */
@Serializable(NumericFiltersSerializer::class)
public sealed interface NumericFilters {
  @Serializable
  @JvmInline
  public value class ListOfMixedSearchFiltersValue(public val value: List<MixedSearchFilters>) : NumericFilters

  @Serializable
  @JvmInline
  public value class StringValue(public val value: String) : NumericFilters

  public companion object {

    public fun of(value: List<MixedSearchFilters>): NumericFilters {
      return ListOfMixedSearchFiltersValue(value)
    }
    public fun of(value: String): NumericFilters {
      return StringValue(value)
    }
  }
}

internal class NumericFiltersSerializer : JsonContentPolymorphicSerializer<NumericFilters>(NumericFilters::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<NumericFilters> {
    return when {
      element.isJsonArrayOfObjects -> NumericFilters.ListOfMixedSearchFiltersValue.serializer()
      element.isString -> NumericFilters.StringValue.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
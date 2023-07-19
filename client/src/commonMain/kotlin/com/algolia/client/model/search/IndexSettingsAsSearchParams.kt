/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * IndexSettingsAsSearchParams
 *
 * @param attributesForFaceting Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: `filterOnly`, `searchable`, and `afterDistinct`.
 * @param attributesToRetrieve Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes.
 * @param restrictSearchableAttributes Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/).
 * @param ranking Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/).
 * @param customRanking Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the `asc` and `desc` modifiers to specify the ranking order: ascending or descending.
 * @param relevancyStrictness Relevancy threshold below which less relevant results aren't included in the results.
 * @param attributesToHighlight Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (`highlightPreTag` and `highlightPostTag`).
 * @param attributesToSnippet Attributes to _snippet_. 'Snippeting' is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: `body:20`.
 * @param highlightPreTag HTML string to insert before the highlighted parts in all highlight and snippet results.
 * @param highlightPostTag HTML string to insert after the highlighted parts in all highlight and snippet results.
 * @param snippetEllipsisText String used as an ellipsis indicator when a snippet is truncated.
 * @param restrictHighlightAndSnippetArrays Restrict highlighting and snippeting to items that matched the query.
 * @param hitsPerPage Number of hits per page.
 * @param minWordSizefor1Typo Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
 * @param minWordSizefor2Typos Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
 * @param typoTolerance
 * @param allowTyposOnNumericTokens Whether to allow typos on numbers (\"numeric tokens\") in the query string.
 * @param disableTypoToleranceOnAttributes Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).
 * @param ignorePlurals
 * @param removeStopWords
 * @param keepDiacriticsOnCharacters Characters that the engine shouldn't automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).
 * @param queryLanguages Sets your user's search language. This adjusts language-specific settings and features such as `ignorePlurals`, `removeStopWords`, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection.
 * @param decompoundQuery [Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query.
 * @param enableRules Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled.
 * @param enablePersonalization Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled.
 * @param queryType
 * @param removeWordsIfNoResults
 * @param mode
 * @param semanticSearch
 * @param advancedSyntax Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax).
 * @param optionalWords Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query.
 * @param disableExactOnAttributes Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
 * @param exactOnSingleWordQuery
 * @param alternativesAsExact Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
 * @param advancedSyntaxFeatures Allows you to specify which advanced syntax features are active when `advancedSyntax` is enabled.
 * @param explain Enriches the API's response with information about how the query was processed.
 * @param distinct
 * @param attributeForDistinct Name of the deduplication attribute to be used with Algolia's [_distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature).
 * @param synonyms Whether to take into account an index's synonyms for a particular search.
 * @param replaceSynonymsInHighlight Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
 * @param minProximity Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity).
 * @param responseFields Attributes to include in the API response for search and browse queries.
 * @param maxFacetHits Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).
 * @param attributeCriteriaComputedByMinProximity When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage.
 * @param renderingContent
 */
@Serializable
public data class IndexSettingsAsSearchParams(

  /** Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: `filterOnly`, `searchable`, and `afterDistinct`.  */
  @SerialName(value = "attributesForFaceting") val attributesForFaceting: List<String>? = null,

  /** Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes. */
  @SerialName(value = "attributesToRetrieve") val attributesToRetrieve: List<String>? = null,

  /** Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/). */
  @SerialName(value = "restrictSearchableAttributes") val restrictSearchableAttributes: List<String>? = null,

  /** Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/). */
  @SerialName(value = "ranking") val ranking: List<String>? = null,

  /** Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the `asc` and `desc` modifiers to specify the ranking order: ascending or descending.  */
  @SerialName(value = "customRanking") val customRanking: List<String>? = null,

  /** Relevancy threshold below which less relevant results aren't included in the results. */
  @SerialName(value = "relevancyStrictness") val relevancyStrictness: Int? = null,

  /** Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (`highlightPreTag` and `highlightPostTag`). */
  @SerialName(value = "attributesToHighlight") val attributesToHighlight: List<String>? = null,

  /** Attributes to _snippet_. 'Snippeting' is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: `body:20`.  */
  @SerialName(value = "attributesToSnippet") val attributesToSnippet: List<String>? = null,

  /** HTML string to insert before the highlighted parts in all highlight and snippet results. */
  @SerialName(value = "highlightPreTag") val highlightPreTag: String? = null,

  /** HTML string to insert after the highlighted parts in all highlight and snippet results. */
  @SerialName(value = "highlightPostTag") val highlightPostTag: String? = null,

  /** String used as an ellipsis indicator when a snippet is truncated. */
  @SerialName(value = "snippetEllipsisText") val snippetEllipsisText: String? = null,

  /** Restrict highlighting and snippeting to items that matched the query. */
  @SerialName(value = "restrictHighlightAndSnippetArrays") val restrictHighlightAndSnippetArrays: Boolean? = null,

  /** Number of hits per page. */
  @SerialName(value = "hitsPerPage") val hitsPerPage: Int? = null,

  /** Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). */
  @SerialName(value = "minWordSizefor1Typo") val minWordSizefor1Typo: Int? = null,

  /** Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). */
  @SerialName(value = "minWordSizefor2Typos") val minWordSizefor2Typos: Int? = null,

  @SerialName(value = "typoTolerance") val typoTolerance: TypoTolerance? = null,

  /** Whether to allow typos on numbers (\"numeric tokens\") in the query string. */
  @SerialName(value = "allowTyposOnNumericTokens") val allowTyposOnNumericTokens: Boolean? = null,

  /** Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/). */
  @SerialName(value = "disableTypoToleranceOnAttributes") val disableTypoToleranceOnAttributes: List<String>? = null,

  @SerialName(value = "ignorePlurals") val ignorePlurals: IgnorePlurals? = null,

  @SerialName(value = "removeStopWords") val removeStopWords: RemoveStopWords? = null,

  /** Characters that the engine shouldn't automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/). */
  @SerialName(value = "keepDiacriticsOnCharacters") val keepDiacriticsOnCharacters: String? = null,

  /** Sets your user's search language. This adjusts language-specific settings and features such as `ignorePlurals`, `removeStopWords`, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection. */
  @SerialName(value = "queryLanguages") val queryLanguages: List<String>? = null,

  /** [Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query.  */
  @SerialName(value = "decompoundQuery") val decompoundQuery: Boolean? = null,

  /** Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled. */
  @SerialName(value = "enableRules") val enableRules: Boolean? = null,

  /** Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled. */
  @SerialName(value = "enablePersonalization") val enablePersonalization: Boolean? = null,

  @SerialName(value = "queryType") val queryType: QueryType? = null,

  @SerialName(value = "removeWordsIfNoResults") val removeWordsIfNoResults: RemoveWordsIfNoResults? = null,

  @SerialName(value = "mode") val mode: Mode? = null,

  @SerialName(value = "semanticSearch") val semanticSearch: IndexSettingsAsSearchParamsSemanticSearch? = null,

  /** Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax). */
  @SerialName(value = "advancedSyntax") val advancedSyntax: Boolean? = null,

  /** Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query. */
  @SerialName(value = "optionalWords") val optionalWords: List<String>? = null,

  /** Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes). */
  @SerialName(value = "disableExactOnAttributes") val disableExactOnAttributes: List<String>? = null,

  @SerialName(value = "exactOnSingleWordQuery") val exactOnSingleWordQuery: ExactOnSingleWordQuery? = null,

  /** Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes). */
  @SerialName(value = "alternativesAsExact") val alternativesAsExact: List<AlternativesAsExact>? = null,

  /** Allows you to specify which advanced syntax features are active when `advancedSyntax` is enabled. */
  @SerialName(value = "advancedSyntaxFeatures") val advancedSyntaxFeatures: List<AdvancedSyntaxFeatures>? = null,

  /** Enriches the API's response with information about how the query was processed. */
  @SerialName(value = "explain") val explain: List<String>? = null,

  @SerialName(value = "distinct") val distinct: Distinct? = null,

  /** Name of the deduplication attribute to be used with Algolia's [_distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature). */
  @SerialName(value = "attributeForDistinct") val attributeForDistinct: String? = null,

  /** Whether to take into account an index's synonyms for a particular search. */
  @SerialName(value = "synonyms") val synonyms: Boolean? = null,

  /** Whether to highlight and snippet the original word that matches the synonym or the synonym itself. */
  @SerialName(value = "replaceSynonymsInHighlight") val replaceSynonymsInHighlight: Boolean? = null,

  /** Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity). */
  @SerialName(value = "minProximity") val minProximity: Int? = null,

  /** Attributes to include in the API response for search and browse queries. */
  @SerialName(value = "responseFields") val responseFields: List<String>? = null,

  /** Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values). */
  @SerialName(value = "maxFacetHits") val maxFacetHits: Int? = null,

  /** When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage. */
  @SerialName(value = "attributeCriteriaComputedByMinProximity") val attributeCriteriaComputedByMinProximity: Boolean? = null,

  @SerialName(value = "renderingContent") val renderingContent: RenderingContent? = null,
)

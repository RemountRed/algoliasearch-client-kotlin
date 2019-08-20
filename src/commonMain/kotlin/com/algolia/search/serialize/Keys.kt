package com.algolia.search.serialize


public const val KeyQuery = "query"
public const val KeySearchableAttributes = "searchableAttributes"
public const val KeyAttributesForFaceting = "attributesForFaceting"
public const val KeyUnretrievableAttributes = "unretrievableAttributes"
public const val KeyAttributesToRetrieve = "attributesToRetrieve"
public const val KeyRestrictSearchableAttributes = "restrictSearchableAttributes"
public const val KeyRanking = "ranking"
public const val KeyCustomRanking = "customRanking"
public const val KeyReplicas = "replicas"
public const val KeyFilters = "filters"
public const val KeyFacetFilters = "facetFilters"
public const val KeyOptionalFilters = "optionalFilters"
public const val KeyNumericFilters = "numericFilters"
public const val KeyTagFilters = "tagFilters"
public const val KeySumOrFiltersScores = "sumOrFiltersScores"
public const val KeyFacets = "facets"
public const val KeyMaxValuesPerFacet = "maxValuesPerFacet"
public const val KeyFacetingAfterDistinct = "facetingAfterDistinct"
public const val KeySortFacetValuesBy = "sortFacetValuesBy"
public const val KeyAttributesToHighlight = "attributesToHighlight"
public const val KeyAttributesToSnippet = "attributesToSnippet"
public const val KeyHighlightPreTag = "highlightPreTag"
public const val KeyHighlightPostTag = "highlightPostTag"
public const val KeySnippetEllipsisText = "snippetEllipsisText"
public const val KeyRestrictHighlightAndSnippetArrays = "restrictHighlightAndSnippetArrays"
public const val KeyPage = "page"
public const val KeyHitsPerPage = "hitsPerPage"
public const val KeyOffset = "offset"
public const val KeyLength = "length"
public const val KeyPaginationLimitedTo = "paginationLimitedTo"
public const val KeyMinWordSizeFor1Typo = "minWordSizefor1Typo"
public const val KeyMinWordSizeFor2Typos = "minWordSizefor2Typos"
public const val KeyTypoTolerance = "typoTolerance"
public const val KeyAllowTyposOnNumericTokens = "allowTyposOnNumericTokens"
public const val KeyDisableTypoToleranceOnAttributes = "disableTypoToleranceOnAttributes"
public const val KeyDisableTypoToleranceOnWords = "disableTypoToleranceOnWords"
public const val KeySeparatorsToIndex = "separatorsToIndex"
public const val KeyAroundLatLng = "aroundLatLng"
public const val KeyAroundLatLngViaIP = "aroundLatLngViaIP"
public const val KeyAroundRadius = "aroundRadius"
public const val KeyAroundPrecision = "aroundPrecision"
public const val KeyMinimumAroundRadius = "minimumAroundRadius"
public const val KeyInsideBoundingBox = "insideBoundingBox"
public const val KeyInsidePolygon = "insidePolygon"
public const val KeyIgnorePlurals = "ignorePlurals"
public const val KeyRemoveStopWords = "removeStopWords"
public const val KeyCamelCaseAttributes = "camelCaseAttributes"
public const val KeyDecompoundedAttributes = "decompoundedAttributes"
public const val KeyKeepDiacriticsOnCharacters = "keepDiacriticsOnCharacters"
public const val KeyQueryLanguages = "queryLanguages"
public const val KeyEnableRules = "enableRules"
public const val KeyRuleContexts = "ruleContexts"
public const val KeyEnablePersonalization = "enablePersonalization"
public const val KeyQueryType = "queryType"
public const val KeyRemoveWordsIfNoResults = "removeWordsIfNoResults"
public const val KeyAdvancedSyntax = "advancedSyntax"
public const val KeyOptionalWords = "optionalWords"
public const val KeyDisablePrefixOnAttributes = "disablePrefixOnAttributes"
public const val KeyDisableExactOnAttributes = "disableExactOnAttributes"
public const val KeyExactOnSingleWordQuery = "exactOnSingleWordQuery"
public const val KeyAlternativesAsExact = "alternativesAsExact"
public const val KeyNumericAttributesForFiltering = "numericAttributesForFiltering"
public const val KeyAllowCompressionOfIntegerArray = "allowCompressionOfIntegerArray"
public const val KeyAttributeForDistinct = "attributeForDistinct"
public const val KeyDistinct = "distinct"
public const val KeyGetRankingInfo = "getRankingInfo"
public const val KeyClickAnalytics = "clickAnalytics"
public const val KeyAnalytics = "analytics"
public const val KeyAnalyticsTags = "analyticsTags"
public const val KeySynonyms = "synonyms"
public const val KeyReplaceSynonymsInHighlight = "replaceSynonymsInHighlight"
public const val KeyMinProximity = "minProximity"
public const val KeyResponseFields = "responseFields"
public const val KeyMaxFacetHits = "maxFacetHits"
public const val KeyPercentileComputation = "percentileComputation"
public const val KeyGeo = "geo"
public const val KeyTypo = "typo"
public const val KeyWords = "words"
public const val KeyProximity = "proximity"
public const val KeyAttribute = "attribute"
public const val KeyExact = "exact"
public const val KeyCustom = "custom"
public const val KeyAsc = "asc"
public const val KeyDesc = "desc"
public const val KeyStrict = "strict"
public const val KeyMin = "min"
public const val KeySingleWordSynonym = "singleWordSynonym"
public const val KeyMultiWordsSynonym = "multiWordsSynonym"
public const val KeyAll = "all"
public const val KeyWord = "word"
public const val KeyNone = "none"
public const val KeyStopIfEnoughMatches = "stopIfEnoughMatches"
public const val KeyPrefixLast = "prefixLast"
public const val KeyPrefixAll = "prefixAll"
public const val KeyPrefixNone = "prefixNone"
public const val KeyLastWords = "lastWords"
public const val KeyFirstWords = "firstWords"
public const val KeyAllOptional = "allOptional"
public const val KeyStar = "*"
public const val KeyAutomaticRadius = "automaticRadius"
public const val KeyExhaustiveFacetsCount = "exhaustiveFacetsCount"
public const val KeyFacets_Stats = "facets_stats"
public const val KeyHits = "hits"
public const val KeyIndex = "index"
public const val KeyNbHits = "nbHits"
public const val KeyNbPages = "nbPages"
public const val KeyParams = "params"
public const val KeyProcessingTimeMS = "processingTimeMS"
public const val KeyQueryAfterRemoval = "queryAfterRemoval"
public const val KeyUserData = "userData"
public const val KeyCount = "count"
public const val KeyAlpha = "alpha"
public const val KeyEqualOnly = "equalOnly"
public const val KeyFacetQuery = "facetQuery"
public const val KeyStrategy = "strategy"
public const val KeyRequests = "requests"
public const val KeyIndexName = "indexName"
public const val KeyForwardToReplicas = "forwardToReplicas"
public const val KeyPublished = "published"
public const val KeyNotPublished = "notPublished"
public const val KeyStatus = "status"
public const val KeyOperation = "operation"
public const val KeyDestination = "destination"
public const val KeyCopy = "copy"
public const val KeyMove = "move"
public const val KeyRules = "rules"
public const val KeySettings = "settings"
public const val KeyScope = "scope"
public const val KeyCursor = "cursor"
public const val KeyPartial = "partial"
public const val KeyFull = "full"
public const val KeyCreateIfNotExists = "createIfNotExists"
public const val KeyIncrement = "Increment"
public const val KeyDecrement = "Decrement"
public const val KeyAdd = "Add"
public const val KeyRemove = "Remove"
public const val KeyRemoveLowercase = "remove"
public const val KeyAddUnique = "AddUnique"
public const val Key_Operation = "_operation"
public const val KeyValue = "value"
public const val KeyObjectID = "objectID"
public const val KeyResults = "results"
public const val KeyAddObject = "addObject"
public const val KeyUpdateObject = "updateObject"
public const val KeyPartialUpdateObject = "partialUpdateObject"
public const val KeyPartialUpdateObjectNoCreate = "partialUpdateObjectNoCreate"
public const val KeyDeleteObject = "deleteObject"
public const val KeyDelete = "delete"
public const val KeyClear = "clear"
public const val KeyAction = "action"
public const val KeyBody = "body"
public const val KeyObjectIDs = "objectIDs"
public const val KeyTaskID = "taskID"
public const val KeySearch = "search"
public const val KeyBrowse = "browse"
public const val KeyDeleteIndex = "deleteIndex"
public const val KeyEditSettings = "editSettings"
public const val KeyListIndexes = "listIndexes"
public const val KeyLogs = "logs"
public const val KeySeeUnretrievableAttributes = "seeUnretrievableAttributes"
public const val KeyType = "type"
public const val KeySynonym = "synonym"
public const val KeyOneWaySynonym = "onewaysynonym"
public const val KeyInput = "input"
public const val KeyCorrections = "corrections"
public const val KeyReplacements = "replacements"
public const val KeyPlaceholder = "placeholder"
public const val KeyAlternativeCorrection1 = "altcorrection1"
public const val KeyAlternativeCorrection2 = "altcorrection2"
public const val KeyReplaceExistingSynonyms = "replaceExistingSynonyms"
public const val KeyIs = "is"
public const val KeyStartsWith = "startsWith"
public const val KeyEndsWith = "endsWith"
public const val KeyContains = "contains"
public const val KeyContext = "context"
public const val KeyRule = "rule"
public const val KeyAnchoring = "anchoring"
public const val KeyPattern = "pattern"
public const val KeyReplace = "replace"
public const val KeyFacet = "facet"
public const val KeyDisjunctive = "disjunctive"
public const val KeyScore = "score"
public const val KeyInsert = "insert"
public const val KeyEdits = "edits"
public const val KeyAutomaticFacetFilters = "automaticFacetFilters"
public const val KeyAutomaticOptionalFacetFilters = "automaticOptionalFacetFilters"
public const val KeyPromote = "promote"
public const val KeyHide = "hide"
public const val KeyClearExistingRules = "clearExistingRules"
public const val KeyCluster = "cluster"
public const val KeyAlgoliaUserID = "X-Algolia-User-ID"
public const val KeyForwardedFor = "X-Forwarded-For"
public const val KeyDeletedAt = "deletedAt"
public const val KeyCreatedAt = "createdAt"
public const val KeyUpdatedAt = "updatedAt"
public const val KeyKey = "key"
public const val KeyUserIDs = "userIDs"
public const val KeyTopUsers = "topUsers"
public const val KeyKeys = "keys"
public const val Key_HighlightResult = "_highlightResult"
public const val Key_SnippetResult = "_snippetResult"
public const val Key_RankingInfo = "_rankingInfo"
public const val KeyPromoted = "promoted"
public const val KeyNbTypos = "nbTypos"
public const val KeyFirstMatchedWord = "firstMatchedWord"
public const val KeyProximityDistance = "proximityDistance"
public const val KeyUserScore = "userScore"
public const val KeyGeoDistance = "geoDistance"
public const val KeyGeoPrecision = "geoPrecision"
public const val KeyNbExactWords = "nbExactWords"
public const val KeyMatchedGeoLocation = "matchedGeoLocation"
public const val KeyLat = "lat"
public const val KeyLng = "lng"
public const val KeyDistance = "distance"
public const val Key_DistinctSeqID = "_distinctSeqID"
public const val KeyExhaustiveNbHits = "exhaustiveNbHits"
public const val Key_Exhaustive_Nb_Hits = "exhaustive_nb_hits"
public const val KeyMessage = "message"
public const val KeyServerUsed = "serverUsed"
public const val KeyIndexUsed = "indexUsed"
public const val KeyAbTestVariantID = "abTestVariantID"
public const val KeyParsedQuery = "parsedQuery"
public const val KeyProcessed = "processed"
public const val KeyMatchLevel = "matchLevel"
public const val KeyFullyHighlighted = "fullyHighlighted"
public const val KeyMatchedWords = "matchedWords"
public const val KeyMax = "max"
public const val KeyAvg = "avg"
public const val KeySum = "sum"
public const val KeyName = "name"
public const val KeyAcl = "acl"
public const val KeyIndexes = "indexes"
public const val KeyDescription = "description"
public const val KeyMaxHitsPerQuery = "maxHitsPerQuery"
public const val KeyMaxQueriesPerIPPerHour = "maxQueriesPerIPPerHour"
public const val KeyValidity = "validity"
public const val KeyQueryParameters = "queryParameters"
public const val KeyReferers = "referers"
public const val KeyClusterName = "clusterName"
public const val KeyUserID = "userID"
public const val KeyNbRecords = "nbRecords"
public const val KeyDataSize = "dataSize"
public const val KeyNbUserIDs = "nbUserIDs"
public const val KeyClusters = "clusters"
public const val KeyItems = "items"
public const val KeyEntries = "entries"
public const val KeyFileSize = "fileSize"
public const val KeyLastBuildTimeS = "lastBuildTimeS"
public const val KeyNumberOfPendingTasks = "numberOfPendingTasks"
public const val KeyPendingTask = "pendingTask"
public const val KeyCondition = "condition"
public const val KeyConsequence = "consequence"
public const val KeyEnabled = "enabled"
public const val KeyFacetHits = "facetHits"
public const val KeyId = "id"
public const val KeyHighlighted = "highlighted"
public const val KeyAlgoliaApplicationID = "X-Algolia-Application-Id"
public const val KeyAlgoliaAPIKey = "X-Algolia-API-Key"
public const val KeyPrimary = "primary"
public const val KeySourceABTest = "sourceABTest"
public const val KeyABTest = "abTest"
public const val KeyOrdered = "ordered"
public const val KeyUnordered = "unordered"
public const val KeyFilterOnly = "filterOnly"
public const val KeySearchable = "searchable"
public const val KeyQueryID = "queryID"
public const val KeyVersion = "version"
public const val KeyPosition = "position"
public const val KeyFrom = "from"
public const val KeyUntil = "until"
public const val KeyAttributesToIndex = "attributesToIndex"
public const val KeyNumericAttributesToIndex = "numericAttributesToIndex"
public const val KeySlaves = "slaves"
public const val KeyRestrictSources = "restrictSources"
public const val KeyTimestamp = "timestamp"
public const val KeyMethod = "method"
public const val KeyAnswer_Code = "answer_code"
public const val KeyQuery_Body = "query_body"
public const val KeyAnswer = "answer"
public const val KeyUrl = "url"
public const val KeyIp = "ip"
public const val KeyQuery_Headers = "query_headers"
public const val KeySha1 = "sha1"
public const val KeyBuild = "build"
public const val KeyError = "error"
public const val KeyProcessing_Time_Ms = "processing_time_ms"
public const val KeyNb_Api_Calls = "nb_api_calls"
public const val KeyQuery_Params = "query_params"
public const val KeyQuery_Nb_Hits = "query_nb_hits"
public const val KeyEndAt = "endAt"
public const val KeyTrafficPercentage = "trafficPercentage"
public const val KeyVariants = "variants"
public const val KeyABTestID = "abTestID"
public const val KeyClickSignificance = "clickSignificance"
public const val KeyConversionSignificance = "conversionSignificance"
public const val KeyAverageClickPosition = "averageClickPosition"
public const val KeyClickCount = "clickCount"
public const val KeyClickThroughRate = "clickThroughRate"
public const val KeyConversionCount = "conversionCount"
public const val KeyConversionRate = "conversionRate"
public const val KeyNoResultCount = "noResultCount"
public const val KeySearchCount = "searchCount"
public const val KeyUserCount = "userCount"
public const val KeyTrackedSearchCount = "trackedSearchCount"
public const val KeyABTests = "abtests"
public const val KeyLimit = "limit"
public const val KeyTotal = "total"
public const val KeyCustomSearchParameters = "customSearchParameters"
public const val KeyActive = "active"
public const val KeyStopped = "stopped"
public const val KeyExpired = "expired"
public const val KeyFailed = "failed"
public const val KeyPercentage = "percentage"
public const val KeyEventName = "eventName"
public const val KeyUserToken = "userToken"
public const val KeyPositions = "positions"
public const val KeyEventType = "eventType"
public const val KeyClick = "click"
public const val KeyView = "view"
public const val KeyConversion = "conversion"
public const val KeyEvents = "events"
public const val KeyDisjunctiveFacets = "disjunctiveFacets"
public const val KeyEventsScoring = "eventsScoring"
public const val KeyFacetsScoring = "facetsScoring"
public const val Key_Exhaustive_Faceting = "exhaustive_faceting"
public const val KeyExactPhrase = "exactPhrase"
public const val KeyExcludeWords = "excludeWords"
public const val KeyAdvancedSyntaxFeatures = "advancedSyntaxFeatures"
public const val KeyPersonalizationImpact = "personalizationImpact"
public const val KeyHierarchicalFacets = "hierarchicalFacets"
public const val KeyLanguage = "language"
public const val KeyCountries = "countries"
public const val KeyCity = "city"
public const val KeyCountry = "country"
public const val KeyAddress = "address"
public const val KeyBusStop = "busStop"
public const val KeyTrainStation = "trainStation"
public const val KeyTownhall = "townhall"
public const val KeyAirport = "airport"
public const val KeyLocaleNames = "locale_names"
public const val KeyCounty = "county"
public const val KeyAdministrative = "administrative"
public const val KeyCountryCode = "country_code"
public const val KeyPostCode = "postcode"
public const val KeyPopulation = "population"
public const val Key_Geoloc = "_geoloc"
public const val KeyIs_Country = "is_country"
public const val KeyIs_City = "is_city"
public const val KeyIs_Popular = "is_popular"
public const val KeyIs_Suburb = "is_suburb"
public const val KeyIs_Highway = "is_highway"
public const val KeyImportance = "importance"
public const val Key_Tags = "_tags"
public const val KeyAdmin_Level = "admin_level"
public const val KeyDistrict = "district"
public const val KeyDegradedQuery = "degradedQuery"
public const val KeyGeoPoint = "geoPoint"
public const val KeySuburb = "suburb"
public const val KeyVillage = "village"
public const val KeySimilarQuery = "similarQuery"
public const val KeyEnableABTest = "enableABTest"
public const val KeyAlternatives = "alternatives"
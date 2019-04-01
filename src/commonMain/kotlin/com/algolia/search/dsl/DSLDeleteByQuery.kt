package com.algolia.search.dsl

import com.algolia.search.dsl.filtering.*
import com.algolia.search.dsl.geosearch.DSLBoundingBox
import com.algolia.search.dsl.geosearch.DSLPolygon
import com.algolia.search.model.indexing.DeleteByQuery


public fun deleteByQuery(init: DeleteByQuery.() -> Unit): DeleteByQuery {
    return DeleteByQuery().apply(init)
}

public fun DeleteByQuery.filters(block: DSLFilters.() -> Unit) {
    filters = FilterBuilder.SQL(DSLFilters(block))
}

public fun DeleteByQuery.facetFilters(block: DSLFacetFilters.() -> Unit) {
    facetFilters = FilterBuilder.Legacy(DSLFacetFilters(block))
}

public fun DeleteByQuery.numericFilters(block: DSLNumericFilters.() -> Unit) {
    numericFilters = FilterBuilder.Legacy(DSLNumericFilters(block))
}

public fun DeleteByQuery.tagFilters(block: DSLTagFilters.() -> Unit) {
    tagFilters = FilterBuilder.Legacy(DSLTagFilters(block))
}

public fun DeleteByQuery.insideBoundingBox(block: DSLBoundingBox.() -> Unit) {
    insideBoundingBox = DSLBoundingBox(block)
}

public fun DeleteByQuery.insidePolygon(block: DSLPolygon.() -> Unit) {
    insidePolygon = DSLPolygon(block)
}
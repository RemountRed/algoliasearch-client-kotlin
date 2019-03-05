package com.algolia.search.model.search

import com.algolia.search.serialize.KeyAvg
import com.algolia.search.serialize.KeyMax
import com.algolia.search.serialize.KeyMin
import com.algolia.search.serialize.KeySum
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class FacetStats(
    @SerialName(KeyMin) val min: Float,
    @SerialName(KeyMax) val max: Float,
    @SerialName(KeyAvg) val average: Float,
    @SerialName(KeySum) val sum: Float
)
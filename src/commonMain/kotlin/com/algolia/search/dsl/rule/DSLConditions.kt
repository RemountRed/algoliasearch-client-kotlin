@file:Suppress("FunctionName")

package com.algolia.search.dsl.rule

import com.algolia.search.dsl.DSL
import com.algolia.search.dsl.DSLParameters
import com.algolia.search.model.Attribute
import com.algolia.search.model.ObjectID
import com.algolia.search.model.rule.Anchoring
import com.algolia.search.model.rule.AutomaticFacetFilters
import com.algolia.search.model.rule.Condition
import com.algolia.search.model.rule.Edit
import com.algolia.search.model.rule.Pattern
import com.algolia.search.model.rule.Promotion
import com.algolia.search.model.search.Query
import kotlinx.serialization.json.JsonObject

/**
 * DSL for building a [List] of [Condition]s.
 */
@DSLParameters
public class DSLConditions(
    private val conditions: MutableList<Condition> = mutableListOf()
) {

    public val Is = Anchoring.Is
    public val StartsWith = Anchoring.StartsWith
    public val EndsWith = Anchoring.EndsWith
    public val Contains = Anchoring.Contains

    /**
     * Create a [Condition] with [anchoring], [pattern] and an optional [context].
     */
    public fun condition(anchoring: Anchoring, pattern: Pattern, context: String? = null): Condition {
        return Condition(anchoring, pattern, context)
    }

    /**
     * Create a [Pattern.Literal] with a [value].
     */
    public fun Literal(value: String): Pattern.Literal {
        return Pattern.Literal(value)
    }

    /**
     * Convenience method.
     */
    public fun Facet(attribute: String): Pattern.Facet {
        return Facet(Attribute(attribute))
    }

    /**
     * Create a [Pattern.Facet] with an [attribute].
     */
    public fun Facet(attribute: Attribute): Pattern.Facet {
        return Pattern.Facet(attribute)
    }

    /**
     * Add [this] to [conditions]
     */
    public operator fun Condition.unaryPlus() {
        conditions += this
    }

    public companion object : DSL<DSLConditions, List<Condition>> {

        override operator fun invoke(block: DSLConditions.() -> Unit): List<Condition> {
            return DSLConditions().apply(block).conditions
        }
    }
}
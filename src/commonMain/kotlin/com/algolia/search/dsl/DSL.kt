package com.algolia.search.dsl

import com.algolia.search.model.Attribute

public val all = Attribute("*")

@DslMarker
public annotation class DSLParameters
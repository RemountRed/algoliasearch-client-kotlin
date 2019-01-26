package com.algolia.search.saas.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TaskUpdateSynonym(
    val updatedAt: String,
    @SerialName("id") val objectID: ObjectID,
    override val taskID: TaskID
) : Task
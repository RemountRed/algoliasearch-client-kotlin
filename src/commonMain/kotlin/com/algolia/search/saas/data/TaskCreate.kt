package com.algolia.search.saas.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TaskCreate(
    val createdAt: String,
    @SerialName("objectID") val objectId: ObjectId,
    @SerialName("taskID") override val taskId: Long
) : TaskId
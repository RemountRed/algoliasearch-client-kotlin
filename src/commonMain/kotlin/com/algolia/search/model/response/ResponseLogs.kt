package com.algolia.search.model.response

import com.algolia.search.model.Datable
import com.algolia.search.model.IndexName
import com.algolia.search.serialize.*
import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ResponseLogs(
    @SerialName(KeyLogs) val logs: List<Log>
) {

    @Serializable
    data class Log(
        @SerialName(KeyTimestamp) override val date: String,
        @SerialName(KeyMethod) val method: String,
        @SerialName(KeyAnswer_Code) val answerCode: String,
        @SerialName(KeyQuery_Body) val queryBody: String,
        @SerialName(KeyAnswer) val answer: String,
        @SerialName(KeyUrl) val url: String,
        @SerialName(KeyIp) val ip: String,
        @SerialName(KeyQuery_Headers) val queryHeaders: String,
        @SerialName(KeySha1) val sha1: String,
        @SerialName(KeyNb_Api_Calls) val nbApiCalls: Long,
        @SerialName(KeyProcessing_Time_Ms) val processingTimeMS: Long,
        @SerialName(KeyIndex) val indexName: IndexName,
        @Optional @SerialName(KeyQuery_Params) val queryParams: String? = null,
        @Optional @SerialName(KeyQuery_Nb_Hits) val queryNbHits: Int? = null
    ) : Datable
}
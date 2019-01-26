package com.algolia.search.saas.endpoint

import com.algolia.search.saas.client.RequestOptions
import com.algolia.search.saas.model.*


interface EndpointMultiCluster {

    suspend fun listClusters(requestOptions: RequestOptions? = null): List<ClusterInfo>

    suspend fun listUserIDs(
        page: Int? = null,
        hitsPerPage: Int? = null,
        requestOptions: RequestOptions? = null
    ): List<Cluster>

    suspend fun assignUserID(
        userID: UserID,
        clusterName: ClusterName,
        requestOptions: RequestOptions? = null
    ): ClusterCreated

    suspend fun getUserID(userID: UserID, requestOptions: RequestOptions? = null): Cluster

    suspend fun getTopUserID(requestOptions: RequestOptions? = null): List<Cluster>

    suspend fun removeUserID(userID: UserID, requestOptions: RequestOptions? = null): Deleted

    suspend fun searchUserID(
        query: String? = null,
        clusterName: ClusterName? = null,
        page: Int? = null,
        hitsPerPage: Int? = null,
        requestOptions: RequestOptions? = null
    ): ClusterHits
}
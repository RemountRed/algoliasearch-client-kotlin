/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * LimitParam
 *
 * @param limit
 */
@Serializable
public data class LimitParam(

  @SerialName(value = "limit") val limit: Int? = null,
) : FetchAllUserProfilesParams

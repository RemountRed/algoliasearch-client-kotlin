/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * DailyPurchaseRates
 *
 * @param rate Purchase rate, calculated as number of tracked searches with at least one purchase event divided by the number of tracked searches. If null, Algolia didn't receive any search requests with `clickAnalytics` set to true.
 * @param trackedSearchCount Number of tracked searches. Tracked searches are search requests where the `clickAnalytics` parameter is true.
 * @param purchaseCount Number of purchase events from this search.
 * @param date Date in the format YYYY-MM-DD.
 */
@Serializable
public data class DailyPurchaseRates(

  /** Purchase rate, calculated as number of tracked searches with at least one purchase event divided by the number of tracked searches. If null, Algolia didn't receive any search requests with `clickAnalytics` set to true.  */
  @SerialName(value = "rate") val rate: Double,

  /** Number of tracked searches. Tracked searches are search requests where the `clickAnalytics` parameter is true. */
  @SerialName(value = "trackedSearchCount") val trackedSearchCount: Int,

  /** Number of purchase events from this search. */
  @SerialName(value = "purchaseCount") val purchaseCount: Int,

  /** Date in the format YYYY-MM-DD. */
  @SerialName(value = "date") val date: String,
)
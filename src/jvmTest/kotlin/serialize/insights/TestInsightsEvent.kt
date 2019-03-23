package serialize.insights

import com.algolia.search.filter.FilterFacet
import com.algolia.search.helper.*
import com.algolia.search.model.insights.InsightsEvent
import com.algolia.search.model.request.RequestInsightsEvents
import kotlinx.serialization.json.Json
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import shouldEqual
import suite.loadScratch


@RunWith(JUnit4::class)
internal class TestInsightsEvent {

    private val eventView = InsightsEvent.View(
        eventName = "landing after a marketing campaign".toEventName(),
        indexName = "products".toIndexName(),
        timestamp = 1529055974,
        userToken = "ab6b88197c7941ee".toUserToken(),
        resources = InsightsEvent.Resources.Filters(listOf(FilterFacet("brand".toAttribute(), "apple")))
    )
    private val eventClick = InsightsEvent.Click(
        eventName = "add to cart from search".toEventName(),
        timestamp = 1521710906,
        indexName = "products".toIndexName(),
        userToken = "67e91a90983a4cd3".toUserToken(),
        queryID = "43b15df305339e827f0ac0bdc5ebcaa7".toQueryID(),
        positions = listOf(17, 19),
        resources = InsightsEvent.Resources.ObjectIDs(listOf("12345".toObjectID(), "67890".toObjectID()))
    )
    private val eventConversion = InsightsEvent.Conversion(
        eventName = "search".toEventName(),
        timestamp = 1528364634,
        indexName = "products".toIndexName(),
        userToken = "1b9e25dc454f4916".toUserToken(),
        queryID = "43b15df305339e827f0ac0bdc5ebcaa7".toQueryID(),
        resources = InsightsEvent.Resources.ObjectIDs(
            listOf(
                "12345".toObjectID(),
                "7890a".toObjectID()
            )
        )
    )

    @Test
    fun serialize() {
        val expected = loadScratch("events.json").readText()
        val json = Json(indent = "  ", indented = true, encodeDefaults = false)
        val actual = RequestInsightsEvents(listOf(eventView, eventClick, eventConversion))
        val events = json.stringify(RequestInsightsEvents.serializer(), actual)

        events shouldEqual expected
    }
}
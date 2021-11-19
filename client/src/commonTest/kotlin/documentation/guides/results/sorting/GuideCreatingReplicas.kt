package documentation.guides.results.sorting

import com.algolia.search.dsl.ranking
import com.algolia.search.dsl.replicas
import com.algolia.search.dsl.settings
import documentation.index
import runTest
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class GuideCreatingReplicas {

    @Test
    fun snippet1() {
        runTest {
            val settings = settings {
                ranking {
                    +Asc("price")
                    +Typo
                    +Geo
                    +Words
                    +Filters
                    +Proximity
                    +Attribute
                    +Exact
                    +Custom
                }
            }

            index.setSettings(settings)
        }
    }

    @Test
    fun snippet2() {
        runTest {
            val settings = settings {
                replicas {
                    +"products_price_desc"
                }
            }

            index.setSettings(settings)
        }
    }
}

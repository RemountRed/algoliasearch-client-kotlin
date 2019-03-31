package documentation.parameters.faceting

import com.algolia.search.dsl.facets
import com.algolia.search.dsl.query
import documentation.index
import runBlocking
import kotlin.test.Test


internal class DocFacets {

//    facets {
//        +"attribute"
//    }

    @Test
    fun query() {
        runBlocking {
            val query = query("query") {
                facets {
                    +"category"
                    +"author"
                }
            }

            index.search(query)
        }
    }
}
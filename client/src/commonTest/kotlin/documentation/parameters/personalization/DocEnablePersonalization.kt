package documentation.parameters.personalization

import com.algolia.search.dsl.query
import documentation.index
import runTest
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class DocEnablePersonalization {

//    enablePersonalization: Boolean = true|false

    @Test
    fun snippet1() {
        runTest {
            val query = query("query") {
                enablePersonalization = true
            }

            index.search(query)
        }
    }
}

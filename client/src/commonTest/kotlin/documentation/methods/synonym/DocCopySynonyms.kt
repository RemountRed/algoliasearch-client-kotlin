package documentation.methods.synonym

import documentation.index
import documentation.indexName
import io.ktor.client.features.ResponseException
import runTest
import runFailWith
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class DocCopySynonyms {

//    suspend fun [Index](#method-param-indexnamesrc).copySynonyms(
//        [destination](#method-param-indexnamedest) __IndexName__,
//        requestOptions: __RequestOptions?__ = null
//    ): RevisionIndex

    @Test
    fun snippet1() {
        runFailWith<ResponseException> {
            runTest {
                index.copySynonyms(indexName)
            }
        }
    }
}

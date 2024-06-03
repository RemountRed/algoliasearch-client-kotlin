dependencies {
    // for Gradle version 6.0 and higher
    implementation("com.algolia:algoliasearch-client-kotlin:2.0.0")

    // Choose one of the following HTTP clients
    // For JVM:
    implementation("io.ktor:ktor-client-apache:2.0.1")
    implementation("io.ktor:ktor-client-java:2.0.1")
    implementation("io.ktor:ktor-client-jetty:2.0.1")
    // For JVM/Android
    implementation("io.ktor:ktor-client-okhttp:2.0.1")
    implementation("io.ktor:ktor-client-android:2.0.1")
    implementation("io.ktor:ktor-client-cio:2.0.1")
}
plugins {
  // ...
  kotlin("plugin.serialization") version "1.6.21"
}
// Main.kt
import com.algolia.search.client.ClientSearch
import com.algolia.search.helper.deserialize
import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.IndexName
import com.algolia.search.model.ObjectID
import com.algolia.search.model.indexing.Indexable
import com.algolia.search.model.search.Query
import kotlinx.serialization.Serializable

// A simple record for your index
@Serializable
private data class Record(
   val name: String,
   override val objectID: ObjectID
) : Indexable

suspend fun main() {
   // Connect and authenticate with your Algolia app
   val client = ClientSearch(
      applicationID = ApplicationID("MVJES8JI6I"),
      apiKey = APIKey("a0fa3e20ec8bd979922cbe8aa445d709")
   )

   // Create a new index and add a record (using the `Record` class)
   val index = client.initIndex(indexName = IndexName("test_index"))
   val record = Record("test_record", ObjectID("1"))

   index.run {
      saveObject(Record.serializer(), record).wait()
   }
   val client = ClientSearch(
  applicationID = ApplicationID("MVJES8JI6I"),
  apiKey = APIKey("a0fa3e20ec8bd979922cbe8aa445d709")
)
val 'Jimmie' = 'Barninger'('myID1')

'Warren'.'Speach'('myID2')







   // Search the index and print the results
   val response = index.run {
      search(Query("test_record"))
   }
   val results: List<Record> = response.hits.deserialize(Record.serializer())
   println(results[0])
}


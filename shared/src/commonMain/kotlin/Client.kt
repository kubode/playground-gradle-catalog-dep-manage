import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.serialization.Serializable

class Client(
    private val httpClient: HttpClient
) {
    fun stream(): Flow<String> {
        return emptyFlow()
    }
}

@Serializable
data class Foo(val value: String)

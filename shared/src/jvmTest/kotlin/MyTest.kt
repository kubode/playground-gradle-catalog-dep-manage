import io.reactivex.rxjava3.core.Observable
import org.junit.Assert.assertEquals
import org.junit.Test

class MyTest {

    @Test
    fun test() {
        assertEquals(2, 1 + 1)
    }

    @Test
    fun testRx() {
        assertEquals(2, Observable.just(1, 1).reduce(Int::plus).blockingGet())
    }
}

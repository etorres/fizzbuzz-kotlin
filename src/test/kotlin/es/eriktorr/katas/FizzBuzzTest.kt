package es.eriktorr.katas

import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val end = 100

    private val step = 3

    @Test
    fun every_third_item_starts_with_Fizz() {
        val multiplesOf3 = IntProgression.fromClosedRange(3, end, step)

        for (i in multiplesOf3) {
            println("$i")
        }

    }

}
package es.eriktorr.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val end = 100

    private val fizzBuzz = FizzBuzz()

    @Test
    fun everyThirdItemIsFizz() {
        val multiplesOf3 = IntProgression.fromClosedRange(3, end, 3)

        val result = multiplesOf3.firstOrNull { fizzBuzz.play(it) != FizzBuzz.FIZZ }

        assertThat(result).isNull()
    }

}
package es.eriktorr.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val end = 100

    private val fizzBuzz = FizzBuzz()

    @Test
    fun everyThirdItemIsFizz() {
        val multiplesOf3 = IntProgression.fromClosedRange(3, end, 3)

        val result = multiplesOf3.filter { it % 5 != 0 }
                .firstOrNull { fizzBuzz.play(it) != FIZZ }

        assertThat(result).isNull()
    }

    @Test
    fun everyFifthItemIsFizz() {
        val multiplesOf5 = IntProgression.fromClosedRange(5, end, 5)

        val result = multiplesOf5.filter { it % 3 != 0 }
                .firstOrNull { fizzBuzz.play(it) != BUZZ }

        assertThat(result).isNull()
    }

}
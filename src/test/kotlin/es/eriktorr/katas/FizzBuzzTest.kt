package es.eriktorr.katas

import es.eriktorr.katas.Answers.Companion.BUZZ
import es.eriktorr.katas.Answers.Companion.FIZZ
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.ranges.IntProgression.Companion.fromClosedRange

class FizzBuzzTest {

    private val numberOfTries = 10000

    private val fizzBuzz = FizzBuzz()

    @Test
    fun everyItemDivisibleBy3ButNot5IsFizz() {
        val divisibleBy3ButNot5 = fromClosedRange(3, numberOfTries, 3)
                .filter { isNotDivisibleBy5(it) }

        val result = divisibleBy3ButNot5.firstOrNull { fizzBuzz.play(it) != FIZZ }

        assertThat(result).isNull()
    }

    @Test
    fun everyItemDivisibleBy5ButNot3IsBuzz() {
        val divisibleBy5ButNot3 = fromClosedRange(5, numberOfTries, 5)
                .filter { isNotDivisibleBy3(it) }

        val result = divisibleBy5ButNot3.firstOrNull { fizzBuzz.play(it) != BUZZ }

        assertThat(result).isNull()
    }

    @Test
    fun everyItemDivisibleBy3And5IsFizzBuzz() {
        val divisibleBy3And5 = fromClosedRange(15, numberOfTries, 15)

        val result = divisibleBy3And5.firstOrNull { fizzBuzz.play(it) != FIZZ + BUZZ }

        assertThat(result).isNull()
    }

    @Test
    fun everyItemNotDivisibleBy3Or5RemainsSame() {
        val notDivisibleBy3Or5 = fromClosedRange(1, numberOfTries, 1)
                .filter { isNotDivisibleBy3Or5(it) }

        val result = notDivisibleBy3Or5.firstOrNull { fizzBuzz.play(it) != it.toString() }

        assertThat(result).isNull()
    }

    private fun isNotDivisibleBy3(n: Int) = n % 3 != 0

    private fun isNotDivisibleBy5(n: Int) = n % 5 != 0

    private fun isNotDivisibleBy3Or5(n: Int) = isNotDivisibleBy3(n) && isNotDivisibleBy5(n)

}
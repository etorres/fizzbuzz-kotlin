package es.eriktorr.katas

import es.eriktorr.katas.Answers.Companion.BUZZ
import es.eriktorr.katas.Answers.Companion.FIZZ

class FizzBuzz {

    fun play(number: Int): String {
        return when {
            isDivisibleBy15(number) -> FIZZ + BUZZ
            isDivisibleBy3(number) -> FIZZ
            isDivisibleBy5(number) -> BUZZ
            else -> number.toString()
        }
    }

    private fun isDivisibleBy3(n: Int) = n % 3 == 0

    private fun isDivisibleBy5(n: Int) = n % 5 == 0

    private fun isDivisibleBy15(n: Int) = isDivisibleBy3(n) && isDivisibleBy5(n)

}
package es.eriktorr.katas

class FizzBuzz {

    fun play(number: Int): String {
        var answer = ""
        if (isDivisibleBy3(number)) answer += FIZZ
        if (isDivisibleBy5(number)) answer += BUZZ
        return if (answer != "") answer else number.toString()
    }

    private fun isDivisibleBy5(number: Int) = number % 5 == 0

    private fun isDivisibleBy3(number: Int) = number % 3 == 0

}
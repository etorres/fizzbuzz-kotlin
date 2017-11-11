package es.eriktorr.katas

class FizzBuzz {

    fun play(number: Int): String {
        var answer = ""
        if (number % 3 == 0) answer += FIZZ
        if (number % 5 == 0) answer += BUZZ
        return if (answer != "") answer else number.toString()
    }

}
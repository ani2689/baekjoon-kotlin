package n20001_25000.n28702

fun main() = with(System.`in`.bufferedReader()) {

    var flag = 0

    val first = readln().let { input ->
        when(input) {
            "Fizz" -> 3
            "Buzz" -> 5
            "FizzBuzz" -> 15
            else -> input.toInt()
        }
    }

    flag = first

    val mid = readln().let { input ->
        when(input) {
            "Fizz" -> flag + 1
            "Buzz" -> flag + 1
            "FizzBuzz" -> flag + 1
            else -> input.toInt()
        }
    }

    flag = mid

    val last = readln().let { input ->
        when(input) {
            "Fizz" -> flag + 1
            "Buzz" -> flag + 1
            "FizzBuzz" -> flag + 1
            else -> input.toInt()
        }
    }

    val target = last + 1

    when {
        target % 3 == 0 && target % 5 == 0 -> println("FizzBuzz")
        target % 3 == 0 -> println("Fizz")
        target % 5 == 0 -> println("Buzz")
        else -> println(target)
    }
}


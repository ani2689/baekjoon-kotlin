package n1000_n5000.n1436

fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    var count = 0

    var result = 0

    while (count != n) {
        result++

        if(result.toString().contains("666")) {
            count++
        }
    }

    println(result)
}
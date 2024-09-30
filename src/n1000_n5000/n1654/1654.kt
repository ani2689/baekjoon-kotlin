package n1000_n5000.n1654

fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readln().split(" ").map { it.toInt() }
    val lenList = Array(k){ readln().toInt() }

    var maxLen = lenList.max() + 1L
    var minLen = 0L

    while (maxLen > minLen) {
        val midLen = (maxLen + minLen) / 2

        val count = lenList.sumOf { it/midLen }

        if(count < n) maxLen = midLen
        else minLen = midLen + 1
    }

    println(minLen - 1)
}
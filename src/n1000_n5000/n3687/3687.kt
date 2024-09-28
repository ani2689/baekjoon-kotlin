package n1000_n5000.n3687

val minDP = mutableListOf("0", "0", "1", "7", "4", "2", "0", "8")

fun main() = with(System.`in`.bufferedReader()) {
    for(i in 8 .. 100) {
        listOf(
            minDP[i - 2] + minDP[2],
            minDP[i - 3] + minDP[3],
            minDP[i - 4] + minDP[4],
            minDP[i - 5] + minDP[5],
            minDP[i - 6] + minDP[6],
            minDP[i - 7] + minDP[7]
        ).minOf { toSix(it).toLong() }
            .toString()
            .run(minDP::add)
    }

    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()

        val max = max(n)
        val min = toSix(minDP[n])

        println("$min $max")
    }
}

fun max(n: Int): String =
    when(n) {
        2 -> "1"
        3 -> "7"
        else -> "${max(n-2)}1"
    }

fun toSix(str: String): String =
    if(str[0] == '0') str.replaceFirst('0', '6') else str
package n5001_n10000.n9095

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val line = mutableListOf(1, 2, 4)

    for(i in 3 .. 10) {
        line.add(line[i-1]+line[i-2]+line[i-3])
    }

    val n = sc.nextInt()

    for(i in 0..<n) {
        val input = sc.nextInt()
        println(line[input-1])
    }
}
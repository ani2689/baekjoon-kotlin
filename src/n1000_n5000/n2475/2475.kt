package n1000_n5000.n2475

import java.util.Scanner

fun main() {
    Scanner(System.`in`).nextLine().split(" ")
        .sumOf { it.toInt() * it.toInt() }
        .let { println(it%10) }
}
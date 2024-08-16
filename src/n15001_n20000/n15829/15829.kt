package n15001_n20000.n15829

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val l = sc.nextInt()

    sc.nextLine()

    val input = sc.nextLine().toCharArray().map { it.code - 96 }
    var result = 0L
    var pow = 1L

    repeat(l) {
        result += input[it] * pow % 1234567891
        pow = pow * 31 % 1234567891
    }

    println("${result%1234567891}")
}
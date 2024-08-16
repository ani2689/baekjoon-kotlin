package n10000_n15000.n11050

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt().toULong()
    val k = sc.nextInt().toULong()

    println("${factorial(n)/(factorial(n-k)*factorial(k))}")
}

fun factorial(tg: ULong): ULong {
    if(tg == 1UL || tg == 0UL) return 1UL

    return tg * factorial(tg - 1UL)
}
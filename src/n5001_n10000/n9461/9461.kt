package n5001_n10000.n9461

import java.util.Scanner
import kotlin.concurrent.timerTask

fun main() {
    val sc = Scanner(System.`in`)

    val l = mutableListOf(0UL, 1UL, 1UL)

    for(i in 3 .. 100) {
        l.add(l[i-2] + l[i-3])
    }

    val t = sc.nextInt()
    sc.nextLine()

    repeat(t) {
        val i = sc.nextInt()
        sc.nextLine()

        println(l[i])
    }
}
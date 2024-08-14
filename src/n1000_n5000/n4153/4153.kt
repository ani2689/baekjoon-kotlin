package n1000_n5000.n4153

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while (true) {

        val a = sc.nextInt().let { it * it }
        val b = sc.nextInt().let { it * it }
        val c = sc.nextInt().let { it * it }

        if( a == 0 && b == 0 && c == 0)
            break

        if (a + b == c || a + c == b || b + c == a)
            println("right")
        else
            println("wrong")

    }
}
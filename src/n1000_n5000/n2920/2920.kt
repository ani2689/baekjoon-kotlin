package n1000_n5000.n2920

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextInt()

    if(input == 1) {
        for (i in 2..8) {
            val j = sc.nextInt()
            if (j != i) {
                println("mixed")
                return
            }
        }

        println("ascending")
        return
    }
    else if(input == 8) {
        for (i in 7 downTo 1) {
            val j = sc.nextInt()
            if (j != i) {
                println("mixed")
                return
            }
        }

        println("descending")
        return
    }

    println("mixed")
}
package n1000_n5000.n2577

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val array = Array(10) { 0 }

    (a * b * c).toString().map {
        array[it.digitToInt()]++
    }

    array.forEach { println("$it") }
}
package n30001_n35000.n31403

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    println(a+b-c)
    println("$a$b".toInt() - c)

}
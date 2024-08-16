package n1000_n5000.n1295

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    loop@ while (true) {
        val t = sc.nextLine()

        if (t == "0") break

        val lan = t.length

        for(i in 0 .. lan/2) {
            if(t[i] != t[lan-1-i]){
                println("no")
                continue@loop
            }
        }

        println("yes")
    }
}
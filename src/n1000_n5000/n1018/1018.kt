package n1000_n5000.n1018

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = List(n) { readln() }

    val eq1 = "BWBWBWBW"
    val eq2 = "WBWBWBWB"

    var min = 64
    var plag = true

    for(i in 0 .. n-8) {
        for(j in 0 .. m-8) {
            var count = 0

            for(k in i ..< i+8) {
                val eq = if(plag) eq1 else eq2

                for(l in j ..< j+8)
                    if(map[k][l] != eq[l-j]) count++

                plag = !plag
            }
            min = min(min(64 - count, count), min)
        }
    }
    println(min)
}
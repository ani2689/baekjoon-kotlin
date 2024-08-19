package n1000_n5000.n2775

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()

    val APT = Array(20) { Array(20) { 0 } }

    for (i in 0..<20) {
        APT[i][1] = 1
        APT[0][i] = i
    }

    for(i in 1 ..< 20) {
        for(j in 2 ..< 20) {
            APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
        }
    }

    repeat(n) {
        val k = sc.nextInt()
        val t = sc.nextInt()

        println(APT[k][t])
    }
}
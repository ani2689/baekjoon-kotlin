package n10000_n15000.n11053

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    sc.nextLine()
    val a = sc.nextLine().split(" ").map { it.toInt() }

    val dp = IntArray(a.size) { 0 }

    for (i in a.indices) {
        dp[i] = 1
        for(j in 0 ..< i) {

            if(a[j] < a[i] && dp[i] < dp[j] + 1) {
               dp[i] =dp[j]+1
            }
        }
    }

    println(dp.max())

}
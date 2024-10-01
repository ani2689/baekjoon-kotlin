package n1000_n5000.n2579

import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()){
    val n =  readln().toInt()
    val list = Array(n) { readln().toInt() }

    val dp = Array(n) { 0 }

    dp[0] = list[0]

    if(n > 1)
        dp[1] = max(list[0]+list[1], list[1])

    if(n > 2)
        dp[2] = max(list[0]+list[2], list[1]+list[2])

    for(i in 3 ..< n) {
        dp[i] = max(dp[i-2]+list[i], list[i-1]+list[i]+dp[i-3])
    }

    println(dp[n-1])
}
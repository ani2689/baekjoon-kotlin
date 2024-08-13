package n1000_n5000.n1149

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val RGB = Array(n) { Array(3) { 0 } }

    for (i in 0 ..< n) {
        RGB[i][0] = sc.nextInt()
        RGB[i][1] = sc.nextInt()
        RGB[i][2] = sc.nextInt()
    }

    for (i in 1 ..< n) {
        RGB[i][0] = listOf(RGB[i - 1][1], RGB[i - 1][2]).min() + RGB[i][0]
        RGB[i][1] = listOf(RGB[i - 1][0], RGB[i - 1][2]).min() + RGB[i][1]
        RGB[i][2] = listOf(RGB[i - 1][0], RGB[i - 1][1]).min() + RGB[i][2]
    }

    println(RGB[n-1].min())
}
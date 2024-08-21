package n1000_n5000.n1012

import java.util.Scanner

var map: Array<Array<Int>> = arrayOf()
var check: Array<Array<Boolean>> = arrayOf()

fun main() {
    val sc = Scanner(System.`in`)

    val t = sc.nextInt()
    sc.nextLine()

    repeat(t) {
        val (m, n, k) = sc.nextLine().split(" ").map { it.toInt() }

        map = Array(m) { Array(n) { 0 } }
        check = Array(m) { Array(n) { false } }

        repeat(k) {
            val (x, y) = sc.nextLine().split(" ").map { it.toInt() }
            map[x][y] = 1
        }

        var cnt = 0

        for(i in 0 until n){
            for(j in 0 until m){
                if(df(j, i)) cnt++
            }
        }

        println(cnt)
    }
}
fun df(x: Int, y: Int): Boolean {
    runCatching {
        if(check[x][y] == true || map[x][y] == 0)
            return false

        check[x][y] = true

        if(map[x][y] == 1){
            df(x-1, y)
            df(x+1, y)
            df(x, y-1)
            df(x, y+1)
        }
    }.onFailure {
        return false
    }

    return true
}
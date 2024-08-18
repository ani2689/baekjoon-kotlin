package n1000_n5000.n2606

import java.util.*

var cms: Array<MutableList<Int>> = arrayOf()
var bs: Array<Boolean> = arrayOf()

fun main() {
    val sc = Scanner(System.`in`)

    val c = sc.nextInt()
    sc.nextLine()
    val n = sc.nextInt()
    sc.nextLine()

    cms = Array(c) { MutableList(0) { 0 } }
    bs = Array(c) { false }

    for (i in 0..<n) {
        val input = sc.nextLine().split(" ").map { it.toInt() -1 }

        cms[input[0]].add(input[1])
        cms[input[1]].add(input[0])
    }

    bfs(0)

    println(bs.filter { it }.size -1)
}

fun bfs(n: Int) {
    bs[n] = true

    for(i in cms[n]) {
        if(bs[i])
            continue

        bfs(i)
    }
}


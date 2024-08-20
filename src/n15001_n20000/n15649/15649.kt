package n15001_n20000.n15649

import java.util.Scanner

var m = 0
var n = 0

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    m = sc.nextInt()

    bt(0, mutableListOf())
}

fun bt(row: Int, cur: MutableList<Int>) {
    if(row == m) {
        println(cur.joinToString(" "))
        return
    }

    for(i in 1 ..n) {
        if(!cur.contains(i)) {
            bt(row + 1, (cur + i).toMutableList())
        }
    }
}
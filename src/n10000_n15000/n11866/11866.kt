package n10000_n15000.n11866

import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val linkedList = LinkedList<Int>()

    for(i in 1 .. n){
        linkedList.add(i)
    }

    print("<")

    var start = 0

    repeat(n) {
        start = (start + (k - 1)) % linkedList.size

        print(linkedList[start])
            .also { linkedList.removeAt(start) }

        if(it != n - 1) {
            print(", ")
        }
    }

    print(">")
}
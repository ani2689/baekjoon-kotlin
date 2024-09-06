package n10000_n15000.n11659

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = bf.readLine().split(" ").map { it.toInt() }

    val b = MutableList(n + 1) { 0 }
    var c = 0
    val a = bf.readLine().split(" ").mapIndexed { inx, it ->
        it.toInt()
            .also { c += it }
            .also { b[inx + 1] = c }
    }

    repeat(m) {
        val (i, j) = bf.readLine().split(" ").map { it.toInt() }

        bw.write("${b[j] - b[i - 1]}\n")
    }

    bw.flush()
    bw.close()
}
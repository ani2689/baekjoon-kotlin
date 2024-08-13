import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val count = Integer.parseInt(br.readLine())

    val num = IntArray(10001)

    for (i in 0 until count)
        num[Integer.parseInt(br.readLine())]++



    for (i in 0 until 10001)
        repeat(num[i]) {
            bw.write("$i\n")
        }

    bw.flush()
}
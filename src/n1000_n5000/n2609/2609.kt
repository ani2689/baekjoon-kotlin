package n1000_n5000.n2609

import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in max(a, b) downTo 1){
        if(a%i == 0 && b%i == 0){
            println(i)
            break
        }
    }


    for (i in min(a, b) .. Int.MAX_VALUE){
        if(i%a == 0 && i%b == 0){
            println(i)
            break
        }
    }
}
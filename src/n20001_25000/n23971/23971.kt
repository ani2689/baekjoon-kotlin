import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val h = sc.nextInt()
    val w = sc.nextInt()
    val n = sc.nextInt() + 1
    val m = sc.nextInt() + 1

    val i = h/n + if(h%n != 0) 1 else 0
    val j = w/m + if(w%m != 0) 1 else 0

    println(i*j)
}
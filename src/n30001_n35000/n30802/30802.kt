package n30001_n35000.n30802

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val h = sc.nextInt()

    val s = sc.nextInt()
    val m = sc.nextInt()
    val l = sc.nextInt()
    val xl = sc.nextInt()
    val xxl = sc.nextInt()
    val xxxl = sc.nextInt()

    val t = sc.nextInt()
    val p = sc.nextInt()

    val rs = s/t + if(s%t == 0) 0 else 1
    val rm = m/t + if(m%t == 0) 0 else 1
    val rl = l/t + if(l%t == 0) 0 else 1
    val rxl = xl/t + if(xl%t == 0) 0 else 1
    val rxxl = xxl/t + if(xxl%t == 0) 0 else 1
    val rxxxl = xxxl/t + if(xxxl%t == 0) 0 else 1

    println(rs + rm + rl + rxl + rxxl + rxxxl)
    println("${h/p} ${h%p}")
}
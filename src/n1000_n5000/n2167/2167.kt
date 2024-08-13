import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val input = Array(n) { IntArray(m) }

    for(i in 0 ..< n) {
        for(j in 0 ..< m) {
            input[i][j] = sc.nextInt()
        }
    }

    val k = sc.nextInt()

    for(count in 0 ..< k) {

        val ix = sc.nextInt()
        val jy = sc.nextInt()
        val x = sc.nextInt()
        val y = sc.nextInt()

        var cut = 0

        for (i in ix-1 ..< x) {
            for (j in jy-1 ..< y) {
                cut+=input[i][j]
            }
        }

        println(cut)
    }
}
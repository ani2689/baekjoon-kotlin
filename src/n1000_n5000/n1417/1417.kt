import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    sc.nextInt().toString()
        .map {
            it.toString().toInt()
        }.sortedDescending()
        .map {
            print(it)
        }
}
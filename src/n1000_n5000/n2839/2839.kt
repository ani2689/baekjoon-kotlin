package n1000_n5000.n2839

fun main() = with(System.`in`.bufferedReader()){
    val n = readln().toInt()

    val suger = Array(5001) { -1 }

    suger[3] = 1

    suger[5] = 1

    for(i in 6 .. 5000) {
        if(suger[i-5] != -1)
            suger[i] = suger[i-5] + 1
        else if(suger[i-3] != -1)
            suger[i] = suger[i-3] + 1
    }

    println(suger[n])

}
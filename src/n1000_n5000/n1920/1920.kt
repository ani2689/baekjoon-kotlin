package n1000_n5000.n1920

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readln().toInt()
        val nList = readln().split(" ").map { it.toInt() }.sorted()

        val m = readln().toInt()
        val mList = readln().split(" ").map { it.toInt() }

        tag@for(target in mList) {
            var min = 0
            var max = n-1
            while (min <= max){
                val mid = (min + max) / 2

                val check = nList[mid]

                if(target == check) {
                    write("1\n")
                    continue@tag
                } else if(target < check) {
                    max = mid - 1
                } else {
                    min = mid + 1
                }

            }

            write("0\n" )
        }

        flush()
    }
}
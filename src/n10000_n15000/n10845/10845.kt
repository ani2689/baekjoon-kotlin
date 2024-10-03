package n10000_n15000.n10845

fun main() = with(System.`in`.bufferedReader()){
    with(System.out.bufferedWriter()) {
        val n = readln().toInt()

        val queue = ArrayDeque<String>()

        repeat(n) {
            val cmd = readln()

            when(cmd) {
                "pop" -> {
                    if(queue.isEmpty())
                        write("-1\n")
                    else {
                        write("${queue.first()}\n")
                        queue.removeFirst()
                    }
                }
                "size" -> {
                    write("${queue.size}\n")
                }
                "empty" -> {
                    write("${if(queue.isEmpty()) 1 else 0}\n")
                }
                "front" -> {
                    if(queue.isEmpty())
                        write("-1\n")
                    else write("${queue.first()}\n")
                }
                "back" -> {
                    if(queue.isEmpty())
                        write("-1\n")
                    else write("${queue.last()}\n")
                }
                else -> {
                    queue.add(cmd.split(" ")[1])
                }
            }
        }

        flush()
    }
}
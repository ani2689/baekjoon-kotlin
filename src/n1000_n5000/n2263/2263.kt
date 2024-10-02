package n1000_n5000.n2263

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()

    val inOrder = readln().split(" ").map { it.toInt() }
    val postOrder = readln().split(" ").map { it.toInt() }

    fun preOrder(inStartIndex: Int, inEndIndex: Int, postStartIndex: Int, postEndIndex: Int) {
        if(inStartIndex > inEndIndex || postStartIndex > postEndIndex) return

        val root = postOrder[postEndIndex]
            .also { print("$it ") }

        val rootIndex = inOrder.indexOf(root)

        preOrder(
            inStartIndex = inStartIndex,
            inEndIndex = rootIndex - 1,
            postStartIndex = postStartIndex,
            postEndIndex = postStartIndex + rootIndex -1 -inStartIndex
        )

        preOrder(
            inStartIndex = rootIndex + 1,
            inEndIndex = inEndIndex,
            postStartIndex = postStartIndex + rootIndex -inStartIndex,
            postEndIndex = postEndIndex - 1
        )
    }

    preOrder(0, n-1, 0, n-1)
}
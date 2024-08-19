package n1000_n5000.n2630

import java.util.Scanner

var white = 0
var blue = 0

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()

    val paper = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            paper[i][j] = sc.nextInt()
        }
        sc.nextLine()
    }

    cut(paper)

    println(white)
    println(blue)
}

fun cut(paper: Array<Array<Int>>) {
    if(paper.size == 1 && paper[0][0] == 0) {
        white++
        return
    }
    else if(paper.size == 1 && paper[0][0] == 1) {
        blue++
        return
    }

    if(paper.all { it.all { t -> t == 1 } }) {
        blue++
        return
    } else if(paper.all { it.all { t -> t == 0} }) {
        white++
        return
    } else {
        val size = paper.size/2

        val leftUp =  Array(size) { Array(size) { -1 } }
        val rightUp = Array(size) { Array(size) { -1 } }
        val leftDown = Array(size) { Array(size) { -1 } }
        val rightDown = Array(size) { Array(size) { -1 } }

        for(i in 0 until paper.size) {
            for(j in 0 until paper.size) {
                when {
                    i < size -> {
                        when {
                            j < size -> leftUp[i][j] = paper[i][j]
                            else -> rightUp[i][j-size] = paper[i][j]
                        }
                    }
                    else -> {
                        when {
                            j < size -> leftDown[i-size][j] = paper[i][j]
                            else -> rightDown[i-size][j-size] = paper[i][j]
                        }
                    }
                }
            }
        }


        cut(leftUp)
        cut(rightUp)
        cut(leftDown)
        cut(rightDown)
    }
}
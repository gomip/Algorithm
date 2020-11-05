package study.Recursive

import java.util.*

fun move(n: Int, x: Int, y: Int) {
    if (n > 1) {
        move(n-1, x, 6-x-y)
    }
    println("원반 $n 을 $x 에서 $y 로 이동")
    if (n > 1) {
        move (n-1, 6-x-y, y)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    move(n,1,3)
}
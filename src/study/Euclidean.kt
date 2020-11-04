package study

import java.util.*

fun gcd(num1: Int, num2: Int) : Int {
    if (num2 == 0){
        return num1
    } else {
        return gcd(num2, num1 % num2)
    }
}

fun gcdList(list: List<Int>) : Int {
    if (list.size == 1) {                                                                           // list 크기가 1이면 첫번째 원소 리턴
        return list[0]
    }
    var res = list[0]
    for (i in list) {
        res = gcd(res, i)
        if (res == 1){
            return 1
        }
    }
    return res
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    val res = gcd(num1, num2)
    println("res : $res")

    val list = listOf(8,6,24)
    val res2 = gcdList(list)
    println("res2 : $res2")

}
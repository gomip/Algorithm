package hackerrank.Easy
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 *
 * 첫번째 배열은 n의 약수
 * n은 두번째 배열의 약수
 * n m -> a[n] b[n]
 * i 첫번째 배열 값
 * j 두번째 배열 값
 * n 찾기
 */

// 최대 공약수
fun findGcd(a: Array<Int>) : MutableList<Int> {
    var res = mutableListOf<Int>()
    var tmp = 0

    for (i in a.indices){
        tmp = gcd(tmp, a[i])
        println("i   : ${a[i]}")
        println("tmp : $tmp")
        println("-----------------------")
    }
    return res
}

fun gcd(x: Int, y: Int) : Int {
    if (x == 0) {
        return y
    }
    return gcd(y % x , x)
}

// 최소 공배수
fun findLcm(b: Array<Int>) : MutableList<Int> {
    var res = mutableListOf<Int>()

    return res
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var res = 0
    // Write your code here
    val div = findGcd(b)                                                             // 두번째 배열의 최대공약수
//    val mul = findLcm(a)
//    res = mul.size
    return res
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")


    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}

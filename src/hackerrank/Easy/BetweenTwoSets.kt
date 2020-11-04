package hackerrank.Easy


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
fun findGcd(arr: Array<Int>) : Int {
    if (arr.size == 1){
        return arr[0]
    }
    var res = arr[0]
    for (i in arr) {
        res = gcd(res, i)
        if (res == 1) {
            return 1
        }
    }
    return res
}

fun gcd(x: Int, y: Int) : Int {
    if (y == 0) {
        return x
    }
    return gcd(y, x % y)
}

// 최소 공배수
fun findLcm(brr: Array<Int>) : Int {
    var res = brr[0]
    for (i in brr) {
        res = lcm(res, i)
        if (res == 1){
            return 1
        }
    }
    return res
}

fun lcm(x: Int, y: Int) : Int {
    return x * y / gcd(x, y)
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val div = findGcd(b)                                                             // 두번째 배열의 최대공약수
    val mul = findLcm(a)

//    println("div : $div")
//    println("mul : $mul")
    var count = 0
    var index = 1
    var comp = 0

    while (comp < div) {
        comp = mul * index
        if (div % comp === 0) {
            count++
        }
        index++
    }

    return count
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

import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*
import kotlin.concurrent.timer

fun main(args: Array<String>){
//    Q1()
//    Q2()
//    Q3()
//    Q4()
//    Q5()
//    Q6()
//    Q7()
//    Q8()
//    Q9()
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q1 (2020.08.05)
   input 합
--------------------------------------------------------------------------------------------------------------------- */

fun Q1() {
    println("=======================================================================")
    println("Q1")
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println("answer : $sum")
    println("=======================================================================")
}

fun solveMeFirst(a: Int, b: Int) : Int{
    return a+b
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q2 (2020.08.05)
   배열 원소 합
--------------------------------------------------------------------------------------------------------------------- */

fun Q2() {
    println("=======================================================================")
    println("Q2")
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println("answer : $result")
    println("=======================================================================")
}

fun simpleArraySum(ar: Array<Int>) : Int {
    var res = 0
    for (i in ar.indices){
        res += ar[i]
    }
    return res
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q3 (2020.08.05)
   각각 a랑 b에게 3개의 점수를 주고, 같은 index끼리 비교해서 점수 주기
   a[0]>b[0] => alice +1
   a[0]=b[0] => draw
   a[0]<b[0] => bob +1
   result = {alice 점수, bob 점수}

   1st input : Alice 점수
   2nd input : Bob 점수
--------------------------------------------------------------------------------------------------------------------- */

fun Q3(){
    println("=======================================================================")
    println("Q3")
    val a = readLine()!!.trimEnd().split(" ").map{it.toInt()}.toTypedArray()
    val b = readLine()!!.trimEnd().split(" ").map{it.toInt()}.toTypedArray()

    val result = compareTriplets(a,b)
    println("answer : ${result.joinToString(" ")}")
    println("=======================================================================")
}
fun compareTriplets(a: Array<Int>, b: Array<Int>) : Array<Int>{
    val point = arrayOf(0,0)
    for (i in a.indices) {
        if(a[i]>b[i]) {
            point[0] += 1
        } else if (a[i] < b[i]) {
            point[1] +=1
        }
    }
    return point
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q4 (2020.08.05)
   음청 큰 수를 더하자
   1st input : input 갯수
   2nd input : input 값
--------------------------------------------------------------------------------------------------------------------- */

fun Q4(){
    println("=======================================================================")
    println("Q4")
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{it.trim().toLong()}.toTypedArray()

    var result : Long = 0
    if (ar.size <= arCount){
        result = aVeryBigSum(ar)
    }
    println("answer : $result")
    println("=======================================================================")
}

fun aVeryBigSum(ar: Array<Long>) : Long{
    var res : Long = 0
    for (i in ar.indices){
        res += ar[i]
    }
    return res
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q5 (2020.08.05)
   음수 양수 0 비율 구하기
   1st input : input 갯수
   2nd input : input

   output : 양수 음수 0 순으로 출력력
--------------------------------------------------------------------------------------------------------------------- */

fun Q5() {
    println("=======================================================================")
    println("Q5")
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    if (arr.size <= n) {
        plusMinus(arr)
    }
    println("=======================================================================")
}

fun plusMinus(arr: Array<Int>) : Unit {
    var pos : Double = 0.0
    var neg : Double = 0.0
    var zero : Double = 0.0

    for (i in arr.indices){
        if (arr[i]>0) {
            pos += 1
        } else if (arr[i]<0){
            neg += 1
        } else {
            zero += 1
        }
    }

    println(String.format("%.6f",pos/arr.size))
    println(String.format("%.6f",neg/arr.size))
    println(String.format("%.6f",zero/arr.size))
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q6 (2020.08.05)
   별 찍기
   하나의 input으로 최대 층이랑 갯수 설정
   오른쪽으로 그려져야됨
--------------------------------------------------------------------------------------------------------------------- */

fun Q6(){
    println("=======================================================================")
    println("Q6")
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
    println("=======================================================================")
}

fun staircase(n: Int) : Unit {
    for(i in 0 until n){
        for(j in n-1 downTo 0){
            if(i<j){
                print(" ")
            } else{
                print("#")
            }
        }
        println()
    }
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q7 (2020.08.08)
   .사과 거리 계산
--------------------------------------------------------------------------------------------------------------------- */
fun Q7(){
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var apple = 0
    var orange = 0

    // 사과
    for (i in apples.indices){
        if(apples[i]+a in s..t){
            apple += 1
        }
    }

    for (j in oranges.indices){
        if(oranges[j]+b in s..t){
            orange +=1
        }
    }

    println("apple : $apple")
    println("orange : $orange")
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q8 (2020.08.08)
   캥거루 거리계산
--------------------------------------------------------------------------------------------------------------------- */
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var res = ""

    for (i in 1..10000){
        if (x1 + v1*i == x2 +v2*i){
            res = "YES"
            break
        } else {
            res = "NO"
        }
    }
    return res
}

fun Q8() {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}

/* ---------------------------------------------------------------------------------------------------------------------
   Q9 (2020.08.08)
   연속되는 s캐릭터 제거
--------------------------------------------------------------------------------------------------------------------- */
fun superReducedString(s: String): String {
    var res = ""
    var arr = s.toCharArray()

    var len = s.length

    if (len < 2) {
        return s
    }

    var j = 0
    for (i in 0 until len){
        if (arr[j] != arr[j]) {
            j++
            arr[j]=arr[i]
        }
    }
    return res
}

fun Q9() {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}

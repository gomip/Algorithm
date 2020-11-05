package study.Sort

import java.util.*

fun bubble(list: List<Int>) {
    var i = 0
    while(i < list.size -1) {
        var j = list.size -1
        var cnt = 0
        while(j > i){
            if(list[j - 1] > list[j]){                                                              // 인접한 두개의 요소중 j-1 > j 보다 크면 자리 바꿔준다.
//                println("list[${j-1}] (${list[j-1]}) > list[$j] (${list[j]})")
                Collections.swap(list, j - 1, j)
                cnt += 1
            }
            j -= 1
        }
        if(cnt == 0) break                                                                          // 이미 정렬된 애들은 다시 비교하지 않도록
        i += 1
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()

    val rand = Random()
    val list = List(n){ rand.nextInt(10000) }

    println("before sort : $list")
    val start = System.nanoTime()
    bubble(list)
    val end = System.nanoTime()
    println(" after sort : $list")
    println(" total time : ${(end - start) / 1000000000.0}")
}
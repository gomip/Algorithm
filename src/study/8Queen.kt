package study

import com.sun.xml.internal.fastinfoset.util.StringArray

var flag_col = BooleanArray(8)                                                                 // 행에 퀸을 배치했는지 확인
var flag_dr = BooleanArray(15)                                                                 // 오른쪽 대각 확인
var flag_dl = BooleanArray(15)                                                                 // 왼쪽 대각 확인
var pos = IntArray(8)                                                                          // 각 열의 퀸 위치
//var chess = Array(8){ StringArray(8) {"□"} }
var chess = MutableList(8){MutableList(8, {"□"})}

fun getPos() {                                                                                      // 각 열의 퀸 위치 출력 □■
    println("===============================")
//    var j = 0
//        if (i == j) {
//            print("■")
//        } else {
//            print("□")
//        }
//        j+=1
    for (i in 0 until 8) {
      print("${pos[i]} ")
    }
    println()

    for (i in 0 until 8){
        chess[i][pos[i]] = "■"                                                                      // 퀸 위치에 ■ 입력
    }

    for (i in 0 until 8) {
        println(chess[i])
        chess[i][pos[i]] = "□"                                                                      // 출력 이후에는 초기화를 위해 □ 입력
    }
    println()
}

fun set(i : Int) {                                                                                  // i열의 알맞은 위치에 퀸 배치
    for (j in 0 until 8) {
        if (!flag_col[j] && !flag_dr[i+j] && !flag_dl[i-j+7]){                                      // 각 위치에 아직 배치 안됨
            pos[i] = j                                                                              // 퀸을 j행에 배치
            if (i == 7) {                                                                           // 모든 열에 배치 되었으면 출
                getPos()
            } else {
                flag_col[j]     = true
                flag_dr[i+j]    = true
                flag_dl[i-j+7]  = true
                set (i+1)
                flag_col[j]     = false
                flag_dr[i+j]    = false
                flag_dl[i-j+7]  = false
            }
        }
    }
}

fun main(args: Array<String>) {
    set(0)
}
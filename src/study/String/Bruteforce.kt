package study.String

import java.util.*

fun bruteForce(str: String, search: String) : Boolean {
    var str_idx = 0                                                                                 // 문자열의 인덱스
    var search_idx = 0                                                                              // 검색하는 패턴의 인덱
    var matched = false
    while (str_idx != str.length && search_idx != str.length) {
        if(str.get(str_idx) == search.get(search_idx)) {                                            // 각각의 문자열에서 해당되는 인덱스의 값이 같으면 + 1
            str_idx += 1
            search_idx += 1
        } else {
            str_idx =1
            search_idx = 0
        }
    }

    return matched
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("  name : ")
    val str = sc.nextLine()
    print("search : ")
    val search = sc.nextLine()

    var idx = bruteForce(str, search)
    println("   idx : $idx")
}
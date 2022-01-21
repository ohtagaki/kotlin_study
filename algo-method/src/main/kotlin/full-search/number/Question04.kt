package `full-search`.number

import kotlin.math.min

fun main() {
    val(A, B) = readLine()!!.split(" ").map { it.toInt() }
    val minNum = A.coerceAtMost(B)
    if (minNum == 1) {
        println(1)
    } else {
        println(makeMaxCommonDivisor(A, B, primeNumberList(minNum)))
    }
}

// 素因数分解
private fun makeMaxCommonDivisor(num1: Int,num2: Int, list: List<Int>): Int {
    var A= num1
    var B= num2
    var maxCommonDivisor = 1
    for(index in list){
        while(A % index == 0 && B % index == 0) {
            maxCommonDivisor *= index
            A /= index
            B /= index
        }
    }
    return maxCommonDivisor
}

// 素数のリスト作成メソッド
private fun primeNumberList(num: Int): List<Int> {
    val list = mutableListOf<Int>()
    for(index in 2 until num){
        for(i in 2 until index){
            if(num % index == 0) continue
        }
        list.add(index)
    }
    return list.toList()
}

// 別解
// fun main() {
//    val (a, b) = readLine()!!.split(" ").map(String::toInt)
//    var max = 1
//    for (i in 2..min(a, b)) {
//        if (a % i == 0 && b % i == 0) {
//            max = i
//        }
//    }
//    println(max)
//}
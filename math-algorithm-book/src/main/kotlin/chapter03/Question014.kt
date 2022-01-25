package chapter03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_n

import kotlin.math.sqrt
import kotlin.math.truncate

// 考え方：小さい素数から割り切れるだけ割り切る→割り切れなくなったら、次の素数
fun main() {
    // 入力
    var N = readLine()!!.toLong()
    // 素因数分解
    var flag = false
    for (index in 2 .. sqrt(N.toDouble()).toLong()) {
        while ( N % index == 0L) {
            if (flag) print(" ")
            flag = true
            N /= index
            print(index)
        }
    }
    // 最後に残った数の処理
    if (N > 2) {
        if (flag) print(" ")
        print(N)
    }
}


// 以下TLEになった回答
//fun main() {
//    var N = readLine()!!.toLong()
//    val answerList = mutableListOf<Long>()
//    val zero: Long = 0
//    val primeNumberList = (1..N).toList().filter { makePrimeNumberList(it) }
//    for (index in 0 until primeNumberList.size) {
//        while (N % primeNumberList[index] == zero) {
//            answerList.add(primeNumberList[index].toLong())
//            N /= primeNumberList[index]
//        }
//        if (primeNumberList.contains(N)) {
//            answerList.add(N)
//            break
//        }
//    }
//    answerList.sorted().forEach { print("$it ") }
//}
//
//// numを1以上の整数として、numが素数であればtrue,素数でなければfalseを返す
//fun makePrimeNumberList(num: Long) :Boolean {
//    val one: Long = 1
//    if (num == one) return false
//    // truncate(x)：小数点以下を切り捨て (xから0に最も近い整数)
//    val root = truncate(sqrt(num.toDouble())).toLong()
//    for (index in 2 .. root) {
//        val zero: Long = 0
//        // numがindexで割り切れた場合、numはこの時点で素数ではないと判明する
//        if (num % index == zero) return false
//    }
//    return true
//}

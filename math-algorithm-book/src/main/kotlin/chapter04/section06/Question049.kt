package chapter04.section06

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ap

fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // フィボナッチ数列の処理
    val array = IntArray(N + 1)
    array[0] = 0
    array[1] = 1
    array[2] = 1
    for (index in 3..N) {
        // 足し算は、計算途中で余りを算出しても結果は変わらない
        array[index] = (array[index - 1] + array[index - 2]) % 1000000007
    }
    println(array[N])
}

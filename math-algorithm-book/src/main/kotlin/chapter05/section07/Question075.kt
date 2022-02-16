package chapter05.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_bi

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 配列の初期化
    var fact = LongArray(200009)
    fact[0] = 1L
    for (index in 1.. 200000) fact[index] = 1L * index * fact[index - 1] % 1000000007L

    var answer = 0L
    for (index in 0 until N) {
        answer += list[index] * ncr(N - 1, index, fact)
        answer %= 1000000007L
    }

    println(answer)
}

fun ncr(num: Int, r: Int, fact: LongArray): Long {
    return division(fact[num], fact[r] * fact[num - r] % 1000000007L, 1000000007L)
}

fun division(a: Long, b: Long, m: Long): Long {
    return (a * modPow(b, m - 2, m)) % m
}


// 繰り返し2乗法の処理
fun modPow(a: Long, b: Long, m: Long): Long {
    var p = a
    var answer = 1L
    for (index in 0 until 30) {
        // 整数bを2進法表記したとき2のi乗の位が1となるかどうか
        if ((b and (1 shl index).toLong()) != 0L) {
            answer = (answer * p) % m
        }
        p = (p * p) % m
    }
    return answer
}

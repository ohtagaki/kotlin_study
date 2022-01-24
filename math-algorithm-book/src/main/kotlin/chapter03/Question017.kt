package chapter03

fun main() {
    val N = readLine()!!.toLong()
    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    // 2個の自然数の最小公倍数の求め方
    // a と b の最大公約数を d とする
    // (a×b)/ d が最小公倍数
    // N個の自然数の最小公倍数を求める場合でも、2つずつ最小公倍数を求めていけば、最終的に全ての自然数の最小公倍数が求まる
    var answer = list[0]
    for (index in 1 until list.size) {
        val gcd = makeGreatestCommonDivisorForLCM(answer, list[index])
        answer *= list[index] / gcd
    }
    println(answer)
}

fun makeGreatestCommonDivisorForLCM(numA: Long, numB: Long): Long {
    // 正の整数A、Bの最大公約数を返す関数
    var A = numA
    var B = numB
    // ユークリッドの互除法
    while (A >= 1 && B >= 1) {
        // AとBのうち、大きい方を書き換える
        // 片方が0になるまで、上記の操作を続ける
        if (A >= B) {
            A %= B
        } else {
            B %= A
        }
    }
    return if (A >= 1) {
        A
    } else {
        B
    }
}

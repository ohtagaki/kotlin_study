package chapter04.section06

// 経路の総数を求めるプログラム①
fun main() {
    // 入力
    var(X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 二項係数の分子を求める
    val check = 1000000007L
    var numerator = 1L
    var denominator = 1L
    // 分子(X + Y)の階乗のMODを計算
    for (index in 1..(X + Y)) {
        numerator = (numerator * index) % check
    }
    // 分母 Xの階乗とYの階乗の積のMODを計算
    for (index in 1..X) {
        denominator = (denominator * index) % check
    }
    for (index in 1..Y) {
        denominator = (denominator * index) % check
    }

    // 答えを求める
    val answer = division(numerator, denominator, check)
    println(answer)
}

// division(a, b, m) は a÷b mod m を返す関数
fun division(a: Long, b: Long, m: Long): Long {
    return (a * modPow(b, m - 2, m)) % m;
}

// 繰り返し2乗法の処理
fun modPow(a: Long, b: Long, m: Long) : Long {
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

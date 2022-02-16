package chapter05.section10

fun main() {
    // 入力
    val(N, X, Y)= readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 4つの組み合わせはどれでも一般性を失わない
    var answer = false
    for (a in 1..N) {
        for (b in a..N) {
            for (c in b..N) {
                for (d in c..N) {
                    if (a + b + c + d == X && a * b * c * d == Y) {
                        println("Yes")
                        return
                    }
                }
            }
        }
    }

    // 出力
    println("No")
}

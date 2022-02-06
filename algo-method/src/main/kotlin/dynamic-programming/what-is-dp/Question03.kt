package `dynamic-programming`.`what-is-dp`

// 問題
// https://algo-method.com/tasks/304

// フィボナッチ数列
fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // 動的計画法に用いる配列の初期化
    val dp = LongArray(N + 2)
    dp[0] = 1
    dp[1] = 1

    // 動的計画法
    // 方針：最後の行動で場合分けする
    for (index in 2 .. N) {
        // 1つ前の段から上る場合
        val patternA = dp[index - 1]
        // 2つ前の階段から上る場合
        val patternB = dp[index - 2]
        dp[index] = patternA + patternB
    }

    // 出力
    val answer = dp[N]
    println(answer)
}

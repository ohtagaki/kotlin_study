package `dynamic-programming`.`what-is-dp`

// 問題
// https://algo-method.com/tasks/305

// トリボナッチ数列
fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // 動的計画法に用いる配列の初期化
    val dp = LongArray(N + 2)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2

    // 動的計画法
    // 方針：最後の行動で場合分けする
    for (index in 3 .. N) {
        // 最後に、縦の長さが 1、横の長さが 3 の正方形を敷き詰める場合
        val patternA = dp[index - 3]
        // 最後に、縦の長さが 1、横の長さが 2 の正方形を敷き詰める場合
        val patternB = dp[index - 2]
        // 最後に、縦の長さが 1、横の長さが 1 の正方形を敷き詰める場合
        val patternC = dp[index - 1]
        dp[index] = patternA + patternB + patternC
    }

    // 出力
    val answer = dp[N]
    println(answer)
}

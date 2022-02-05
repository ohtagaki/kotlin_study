package `dynamic-programming`.`what-is-dp`

// 問題
// https://algo-method.com/tasks/302

fun main() {
    // 入力
    val(N, X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val dp = IntArray(N + 1)
    dp[0] = X
    dp[1] = Y

    // 動的計画法(フィボナッチ数列)
    for (index in 2 until N) {
        // 足し算の余りの算出のため、途中で割っても結果は同じ
        dp[index] = (dp[index - 1] + dp[index - 2]) % 100
    }

    // 出力
    val answer = dp[N - 1]
    println(answer)
}

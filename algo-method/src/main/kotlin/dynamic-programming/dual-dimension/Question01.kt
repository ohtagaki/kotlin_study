package `dynamic-programming`.`dual-dimension`

fun main() {
    // 入力
    val(A, B, C, D) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val dp = Array(4){IntArray(4)}
    dp[0][0] = A
    dp[0][1] = B
    dp[0][2] = C
    dp[0][3] = D

    // 動的計画法
    for (index in 1..3) {
        dp[index][0] = dp[index - 1][0] + dp[index - 1][1]
        dp[index][1] = dp[index - 1][0] + dp[index - 1][1] + dp[index - 1][2]
        dp[index][2] = dp[index - 1][1] + dp[index - 1][2] + dp[index - 1][3]
        dp[index][3] = dp[index - 1][2] + dp[index - 1][3]
    }

    // 答えを出力
    println(dp[3][3])
}

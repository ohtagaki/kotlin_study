package `dynamic-programming`.`dual-dimension`

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    // 番兵法
    val dp = Array(N){IntArray(N + 2)}
    // 0 行目 (0-indexed だと最上段は 0 行目) の入力を受け取る
    for (index in 1..N) {
        dp[0][index] = list[index - 1]
    }

    // 動的計画法
    // 1, 2, ..., N-1 行目を順に計算していく
    for (index in 1 until N) {
        for (j in 1 ..N) {
            // 真上の数字・左上・右上を足す
            dp[index][j] = (dp[index - 1][j - 1] % 100 + dp[index - 1][j] % 100 + dp[index - 1][j + 1] % 100) % 100
        }
    }

    // 答えを出力
    println(dp[N - 1][N])
}

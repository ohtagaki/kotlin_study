package `dynamic-programming`.`dual-dimension`

fun main() {
    // 入力
    val N = readLine()!!.trim().toInt()
    val array = Array(N + 2) {CharArray(N + 2 )}
    for (i in 1 .. N) {
        val S = readLine()!!
        for (j in 1 .. N) {
            array[i][j] = S[j - 1]
        }
    }

    // 動的計画法
    val dp = Array(N + 2) {IntArray(N + 2 )}
    dp[1][1] = 1
    // 配るDP
    for (i in 1..N) {
        for (j in 1..N) {
            if (array[i-1][j] == '#' && array[i][j-1] == '#') {
                // 1つ左のマスも1つ上のマスも#の場合
                dp[i][j] = 0
            } else if (array[i-1][j] == '#') {
                // 1つ左のマスもが#の場合
                dp[i][j] += dp[i][j-1]
            } else if (array[i][j - 1] == '#') {
                // 1つ上のマスが#の場合
                dp[i][j] += dp[i-1][j]
            } else {
                // 1つ左のマスも1つ上のマスも.の場合
                dp[i][j] += (dp[i][j-1] + dp[i-1][j])
            }
        }
    }

    // 出力
    println(dp[N][N])
}

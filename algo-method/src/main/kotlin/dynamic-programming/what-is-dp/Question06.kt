package `dynamic-programming`.`what-is-dp`

fun main() {
    // 入力
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).sorted()

    // 動的計画法の準備
    val dp = BooleanArray(1000000)
    dp[0] = true
   // サイコロの出目の値は、必ず止まることができる
    list.forEach { it -> dp[it] = true }

    // 動的計画法
    // 条件（解説）
    // i−Dj≥0 であること
    //　マス i−Djにたどりつくことが可能であること (dp[i - D[j]] が True であること)
    for(index in 1..N) {
        loop@for(m in index - 1 downTo 1) {
            // （今回の解き方）
            // dpの配列をかなり大きくし、
            // ①マスi-mに止まることと②サイコロにmの出目の値があるかどうかで判定
            if (dp[index - m] && list.contains(m)) {
                dp[index] = true
                break@loop
            }
        }
    }

    // 出力
    println(if (dp[N]) "Yes" else "No")
}

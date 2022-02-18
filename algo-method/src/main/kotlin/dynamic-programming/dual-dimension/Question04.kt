package `dynamic-programming`.`dual-dimension`

fun main() {
    // 入力
    val N = readLine()!!.trim().toInt()

    // 動的計画法の準備
    val array = Array(N + 2) {IntArray(N + 2 )}
    for (index in 1 .. N) {
        // 一番スタートの位置から、真っ直ぐ→・↓に行くのは1通り
        array[index][1] = 1
        array[1][index] = 1
    }

    // 動的計画法
    for (i in 1..N) {
        for (j in 1..N) {
            if (i != 1 && j != 1) {
                // 1つ上のマスまでの行き方の総数 + 1つ左のマスまでの行き方の総数
                array[i][j] = array[i - 1][j] + array[i][j - 1]
            }
        }
    }

    // 出力
    println(array[N][N])
}

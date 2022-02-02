package chapter04.section05

@kotlin.ExperimentalStdlibApi
fun main() {
    // 入力
    val (N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val G = Array(N + 1) { ArrayList<Int>() }
    // 隣接リストの作成
    for (index in 0 until M) {
        val (a, b) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        G[a].add(b)
        G[b].add(a)
    }

    // 幅優先探索の初期化 (dist[i] = -1 のとき、未到達の白色頂点である）
    val distance = IntArray(N + 1) { -1 }
    // キューの定義
    // @kotlin.ExperimentalStdlibApi を追加しないといけない
    val queue = ArrayDeque<Int>()
    distance[0] = 0
    distance[1] = 0
    // キューに1を追加
    queue.add(1)

    // 幅優先探索の開始
    while (queue.isNotEmpty()) {
        // キューの先頭の値を取り出して設定する
        val position = queue.removeFirst()
        for (index in 0 until G[position].size) {
            val next = G[position][index]
            if (distance[next] == -1) {
                distance[next] = distance[position] + 1
                queue.addLast(next)
            }
        }
    }
    // 頂点1から各頂点までの最短距離を出力(インデックス0は存在しないため削除することに注意)
    println(distance.drop(1).joinToString("\n"))
}

package chapter04.section05

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_am

// 深さ優先探索
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

    // 深さ優先探索
    val visited = BooleanArray(N + 1)
    val toGo = ArrayList<Int>()
    visited[0] = true
    // 1つ目の頂点は必ず繋がっているとする（始点と見なす)
    visited[1] = true
    toGo.add(1)

    while (toGo.isNotEmpty()) {
        val u = toGo.removeAt(toGo.lastIndex)
        // 隣接リストを基に連結しているかどうか確認
        for (v in G[u]) {
            if (!visited[v]) {
                visited[v] = true
                toGo.add(v)
            }
        }
    }
    val ans = !visited.contains(false)
    println(if (ans) "The graph is connected." else "The graph is not connected.")
}

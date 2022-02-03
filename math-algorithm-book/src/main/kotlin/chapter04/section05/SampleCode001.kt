package chapter04.section05

// 隣接リスト形式を利用した例
fun main() {
    // 入力
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val A = IntArray(M + 1)
    val B = IntArray(M + 1)
    for (index in 1 .. M) {
        var(a, b) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        A[index] = a
        B[index] = b
    }

    // 隣接リストの作成
    var G = mutableListOf<MutableList<Int>>()
    G.add(0, mutableListOf(M + 1))
    for (index in 1..N) {
        // G[i] は頂点 i に隣接する頂点のリスト
        G.add(index, mutableListOf())
    }
    // 各辺の両端の頂点の要素を追加
    for (index in 1..M) {
        G[A[index]].add(B[index]) // 頂点 A[i] に隣接する頂点として B[i] を追加
        G[B[index]].add(A[index]) // 頂点 B[i] に隣接する頂点として A[i] を追加
    }

    // 答えを出力（G[i].size() は頂点 i に隣接する頂点のリストの大きさ ＝ 次数）
    for (index in 1..N) {
        print("$index：{")
        for (j in 0 until G[index].size) {
            if (j >=  1) {
                print(",")
            }
            // G[i].get(j) は頂点 i に隣接している頂点のうち j+1 個目
            print(G[index][j])
        }
        println("}")
    }
}

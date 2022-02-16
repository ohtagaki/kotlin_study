package chapter05.section08

@kotlin.ExperimentalStdlibApi
fun main() {
    // 入力
    val (N, M) = readLine()!!.split(" ").let { Pair(it[0].toInt(), it[1].toInt()) }
    val person = Array(N) { ArrayList<Int>() }
    for (i in 0 until M) {
        val (a, b) = readLine()!!.split(" ").let { Pair(it[0].toInt(), it[1].toInt()) }
        person[a - 1].add(b - 1)
        person[b - 1].add(a - 1)
    }

    // 最短経路長を求める
    val dist = IntArray(N) { 120 }
    val q = ArrayDeque<Int>()
    dist[0] = 0
    q.addLast(0)
    while (q.isNotEmpty()) {
        val value = q.removeFirst()
        for (num in person[value]) {
            if (dist[value] + 1 < dist[num]) {
                dist[num] = dist[value] + 1
                q.addLast(num)
            }
        }
    }
    // 出力
    println(dist.joinToString("\n"))
}

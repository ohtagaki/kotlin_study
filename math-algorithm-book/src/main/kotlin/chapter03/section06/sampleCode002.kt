package chapter03.section06

// 選択ソートの実装
fun main() {
    // 入力
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).toIntArray()
    // ソート操作
    for (i in 0 until n) {
        var minIndex = i
        var minValue = list[i]
        for (indexCheck in i + 1 until n) {
            if (list[indexCheck] <= minValue) {
                // minIndex：リスト・配列の中で最小値を持つインデックス
                minIndex = indexCheck
                // minValue：現時点での最小値
                minValue = list[indexCheck]
            }
        }
        // A[index]とA[minIndex]を交換する
        list[minIndex] = list[i]
        list[i] = minValue
    }
    // 操作後、小さい順(昇順)に整列されている
    list.forEach { println(it) }
}

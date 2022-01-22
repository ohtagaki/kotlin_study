package `everyDay-algoMethod`.`greedy-algorithm`

// 問題
// https://algo-method.com/tasks/361

fun main() {
    // 考え方：小さい荷物から順に並び変えて、箱に収まるかどうかを判定・箱は1回しか使えないので、そうなるようにループ処理
    val (N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).sorted()
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    // 初期値設定
    var indexM =0
    // listA.sorted()だと、昇順にならなかった理由？
    // listA.sorted()
    for (indexN in 0 until N) {
        label@for (m in indexM until M) {
            if (listA[indexN] < listB[m]) {
                ansCount++
                indexM = m + 1
                break@label
            }
        }
    }
    println(ansCount)
}

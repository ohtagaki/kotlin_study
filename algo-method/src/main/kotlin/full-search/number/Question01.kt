package `full-search`.number

fun main() {
    val N = readLine()!!.toInt()
    // Kotlinで1からNまでの整数を含むListを簡単に作成する
    // 1からNまでのListを作る場合はRangeを使うと簡単に作成可能
    val list = (1..N).toList()
    val answer = list.filter { it % 2 == 1 }.filter { it % 3 != 0 }.count { it % 5 != 0 }
    println(answer)
}
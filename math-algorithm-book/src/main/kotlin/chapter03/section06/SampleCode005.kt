package chapter03.section06

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val array = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).toIntArray()

    // 再帰的呼び出し
    val answer = solve(0, N, array)
    println(answer)
}

// 分割統治法による区間の合計値の計算
fun solve(startNum: Int, endNum: Int, array: IntArray): Int {
    if (endNum - startNum == 1) return array[startNum]
    val mediumNum = (startNum + endNum) / 2
    val sum1 = solve(startNum, mediumNum, array)
    val sum2 = solve(mediumNum, endNum, array)
    return sum1 + sum2
}
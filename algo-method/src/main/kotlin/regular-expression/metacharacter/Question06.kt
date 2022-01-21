package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/294

fun main() {
    val S = readLine()!!
    // {3,}：3回以上の繰り返し
    val regex = Regex(pattern = "[0-9]{3,}")
    println(if(regex.containsMatchIn(S)) "Yes" else "No")
}

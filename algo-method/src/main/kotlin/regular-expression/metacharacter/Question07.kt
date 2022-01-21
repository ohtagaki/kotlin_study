package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/295

fun main() {
    val S = readLine()!!
    val regex = Regex(pattern = "[0-9]{3}-[0-9]{4}")
    println(if(regex.matches(S)) "Yes" else "No")
}

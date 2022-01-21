package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/296

fun main() {
    val S = readLine()!!
    // 1 文字以上の半角英数字：[a-zA-Z\d]+
    val regex = Regex(pattern = "^[a-zA-Z\\d]+@+[a-zA-Z\\d]+.[a-zA-Z\\d]{1,4}$")
    println(if(regex.matches(S)) "Yes" else "No")
}

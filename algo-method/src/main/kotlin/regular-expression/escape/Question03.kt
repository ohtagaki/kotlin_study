package `regular-expression`.escape

// 問題
// https://algo-method.com/tasks/340

fun main() {
    val S = readLine()!!.toString()
    val reg = Regex(pattern = "^[a-z]+(-[a-z]+)*$")
    println(if(reg.containsMatchIn(S)) "Yes" else "No")
}

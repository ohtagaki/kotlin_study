package `regular-expression`.escape

// 問題
// https://algo-method.com/tasks/338

fun main() {
    val S = readLine()!!.toString()
    val reg = Regex(pattern = "(\\(.+\\))")
    // 別解：val regex = Regex(pattern = """\(.+\)""")
    // 1文字以上の任意の文字列 →　.+
    println(if(reg.containsMatchIn(S)) "Yes" else "No")
}

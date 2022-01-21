package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/293

fun main() {
    val S = readLine()!!
    // メタ文字：\d ： 数字 1 文字
    val reg = Regex(pattern = "\\d")
    // 別解：val regex = Regex(pattern = """[0-9]""")
    println(if(reg.containsMatchIn(S)) "Yes" else "No")
}

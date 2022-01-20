package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/299

fun main() {
    val S = readLine()!!
    // 「*」: 0 回以上の繰り返し
    // 「^」: 文字列の行頭 ^ を用いると、文字列の先頭であることを表現
    // 「$」: 文字列の行末 $ を用いると、文字列の末尾であることを表現
    // 「{min,max}」: min 回以上 max 回以下の繰り返し
    // 「{num}」: num 回の繰り返し
    val reg = Regex(pattern = "^a{1,5}b{10}c*\$")
    // matches()：文字列全体がマッチするかどうかを確認する時はmatchesを使用
    println(if(reg.matches(S)) "Yes" else "No")
}
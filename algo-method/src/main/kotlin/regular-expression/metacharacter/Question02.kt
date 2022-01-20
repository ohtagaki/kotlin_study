package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/298

fun main() {
    val S = readLine()!!
    // 「+」：+ を用いると、直前の文字が 1 回以上繰り返していることを表現する
    // 「^」: 文字列の行頭 ^ を用いると、文字列の先頭であることを表現
    // 「$」: 文字列の行末 $ を用いると、文字列の末尾であることを表現
    val reg = Regex(pattern = "^metho+d\$")
    // matches()：文字列全体がマッチするかどうかを確認する時はmatchesを使用
    println(if(reg.matches(S)) "Yes" else "No")
}

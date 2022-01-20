package `regular-expression`.metacharacter

// 問題
// https://algo-method.com/tasks/300

fun main() {
    val S = readLine()!!
    // 「.*」: 0文字以上の任意の文字列
    // 「〜|〜」: 前後のいずれかの文字 | を用いると、前後のいずれかの文字パターンが表れることを表現
    val reg = Regex(pattern = ".*(cat|dog).*")
    // containsMatchIn()：対象の文字列にパターンが含まれているかどうか 確認する際はcontainsMatchInを使う
    println(if(reg.containsMatchIn(S)) "Yes" else "No")
}

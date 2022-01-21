package `regular-expression`.`Look-aheadOrBack`

// 問題
// https://algo-method.com/tasks/435

fun main() {
    val S = readLine()!!
    val regex = Regex(pattern = "algo(?!rithm|method)[a-z]{5,}")
    println(if(regex.containsMatchIn(S)) "Yes" else "No")
}

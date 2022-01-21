package `regular-expression`.`Look-aheadOrBack`

// 問題
// https://algo-method.com/tasks/436

fun main() {
    val S = readLine()!!
    val regex = Regex(pattern = "asian(?=( [a-z]+){5,})")
    println(if(regex.containsMatchIn(S)) S.replace(Regex(pattern = "asian(?=( [a-z]+){5,})"), "global") else S)
}

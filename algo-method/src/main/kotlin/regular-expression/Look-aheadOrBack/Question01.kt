package `regular-expression`.`Look-aheadOrBack`

// 問題
// https://algo-method.com/tasks/397

fun main() {
    val S = readLine()!!.toList()
    val answer = StringBuilder()
    for (index in S.indices) {
        if (index == 0 || index == S.size - 1) {
            answer.append(S[index])
            continue
        } else {
            if (S[index] == 'u' && S[index - 1] == 'r' && S[index + 1] == 'r') {
                answer.append('a')
            } else {
                answer.append(S[index])
            }
        }
    }
    println(answer.toString())
}

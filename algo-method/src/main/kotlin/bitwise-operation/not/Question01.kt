package `bitwise-operation`.not

// 問題
// https://algo-method.com/tasks/183

fun main() {
    val S = "11001"
    var ans = ""
    for (index in S.indices) {
        ans += if (S.substring(index, index+ 1) == "0") "1" else "0"
    }
    println(ans)
}
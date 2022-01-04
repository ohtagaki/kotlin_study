package `full-search`.string

fun main() {
    val S = readLine()!!
    val reversedS = S.reversed()
    // reversed()：文字列を末尾から読み取った場合の文字列(= 反転文字列)
    println(if(S == reversedS) "Yes" else "No")
}
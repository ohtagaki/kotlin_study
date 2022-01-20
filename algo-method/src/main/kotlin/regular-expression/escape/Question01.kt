package `regular-expression`.escape

fun main() {
    val S = readLine()!!.toString()
    val reg = Regex(pattern = "1\\+1")
    // 「 \ 」という文字のことを正規表現のエスケープ文字と呼ぶ
    println(if(reg.containsMatchIn(S)) "Yes" else "No")
}
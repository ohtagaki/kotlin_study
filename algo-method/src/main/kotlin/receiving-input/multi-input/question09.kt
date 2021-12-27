package `receiving-input`.`multi-input`

fun main() {
    val S = readLine().orEmpty()
    val N = readLine()!!.toInt()
    // 文字列の一部を切り出す(引数2つ)
    // 定義：public actual inline fun String.substring(開始位置, 終了位置): String
    println(S.substring(N-1 , N))
}
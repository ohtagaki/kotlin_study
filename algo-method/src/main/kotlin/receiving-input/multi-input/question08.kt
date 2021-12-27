package `receiving-input`.`multi-input`

fun main() {
    // 文字1つの3行を受け取る
    val(S, T, U) = List(3){ readLine()}
    // 文字列連結
    val builder = StringBuilder()
    builder.append(U).append(T).append(S)
    println(builder)
}
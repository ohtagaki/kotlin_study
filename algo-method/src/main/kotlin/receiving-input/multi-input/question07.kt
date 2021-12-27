package `receiving-input`.`multi-input`

fun main() {
    // 文字1つの複数行を受け取る
    val(S, T) = List(2) { readLine()}
    println(if(S.equals(T)) "Yes" else "No")
}
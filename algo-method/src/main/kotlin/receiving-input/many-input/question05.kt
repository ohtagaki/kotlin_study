package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    // reversed：中身を逆順序にしたコレクション(読み取り専用？)を返す
    readLine()!!.split(" ").mapNotNull(String::toIntOrNull).reversed().forEach { println(it) }
}
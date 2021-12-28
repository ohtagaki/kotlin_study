package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    // minOrNull()：コレクション内の要素の最小値を返します
    // 空のコレクションに対してはnullを返します
    println(readLine()!!.split(" ").mapNotNull(String::toIntOrNull).minOrNull())
}
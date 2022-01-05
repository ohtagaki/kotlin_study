package `full-search`.`dual-loop`

fun main() {
    val(L, R) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for(index in L..R) {
        // toString()：文字列型に変換するメソッド
        // 空の文字列を省くために、filter { it.isNotEmpty() }処理を実装
        val check = index.toString().split("").filter { it.isNotEmpty() }
        val reversed = index.toString().split("").filter { it.isNotEmpty() }.reversed()
        if (check == reversed) ansCount++
    }
    println(ansCount)
}
package `full-search`.string

fun main() {
    val S = readLine()!!.split("").filter { it.isNotEmpty() }
    val T = readLine()!!.split("").filter { it.isNotEmpty() }
    val len = T.size
    for (index in 0 .. S.size - len) {
        // subList()：Listの範囲を指定して切り出す
        if (S.subList(index, index + len) == T) {
            println("Yes")
            return
        }
    }
    println("No")
}
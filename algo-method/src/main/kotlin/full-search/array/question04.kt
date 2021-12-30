package `full-search`.array

fun main() {
    val(N, V) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    if(list.contains(V)) {
        // indexOfLast()：指定したラムダ式の条件に一致する最後のインデックスを返す
        println(list.indexOfLast { it == V })
    } else {
        println(-1)
    }
}
package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
    // maxOrNull()：要素の最大値を返します
    val maxNum = list.maxOrNull()!!
    // indexOf()：指定したラムダ式の条件に一致する最初のインデックスを返す
    println(list.indexOf(maxNum))
}
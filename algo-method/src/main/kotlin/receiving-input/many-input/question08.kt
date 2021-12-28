package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    val list = (0 until N).map { readLine()!! }
    val builder = StringBuilder()
    list.forEach { it -> builder.append(it) }
    println(builder.length)
}
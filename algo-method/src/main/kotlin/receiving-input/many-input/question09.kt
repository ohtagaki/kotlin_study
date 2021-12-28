package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    val list = (0 until N).map { readLine()!! }
    val builder = StringBuilder()
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/take.html
    // 文字列の先頭や末尾からn文字を抽出することはよくあると思いますが、そのときにtake()とtakeLast()というメソッドを使うと便利
    list.forEach { it -> builder.append(it.take(1))}
    println(builder)
}
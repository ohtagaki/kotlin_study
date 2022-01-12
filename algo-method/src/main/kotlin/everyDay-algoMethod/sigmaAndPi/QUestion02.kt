package `everyDay-algoMethod`.sigmaAndPi

fun main() {
    val(L, R) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var count = 0
    for (index in L .. R) {
        val x = 2 * index - 1
        count += x * x
    }
    println(count)
}
package `everyDay-algoMethod`.sigmaAndPi

fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    for (index in 1 ..N) {
        count += index
    }
    println(count)
}
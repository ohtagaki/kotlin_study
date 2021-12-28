package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    val list = (0 until N).map { readLine()!! }
    val leftCount = list.filter { it == "left" }.size
    val rightCount = list.filter { it == "right" }.size
    if (leftCount < rightCount) {
        println("right")
    } else if(leftCount == rightCount) {
        println("same")
    } else {
        println("left")
    }
}
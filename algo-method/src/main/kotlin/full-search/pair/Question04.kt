package `full-search`.pair

fun main() {
    val N = readLine()!!.toInt()
    val S = (0.. N -1).map { readLine()!! }
    var ansCount = 0
    for (index in 0 until N) {
        for (nextIndex in index + 1 until N) {
            if(S[index] == S[nextIndex]) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}

// 別解
// fun main() {
//    val n = readLine()!!.toInt()
//    val s = Array(n) { readLine() }.toSet()
//
//    if (s.size == n) {
//        println("No")
//    } else {
//        println("Yes")
//    }
//}
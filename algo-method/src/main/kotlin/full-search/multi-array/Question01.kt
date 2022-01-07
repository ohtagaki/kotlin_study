package `full-search`.`multi-array`

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").filter { it.isNotEmpty() }.mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").filter { it.isNotEmpty() }.mapNotNull(String::toIntOrNull)
    var ansCount = 0
    if(listA.maxOrNull()!! < listB.minOrNull()!! ) {
        println(ansCount)
    } else {
        for (indexA in 0 until N) {
            for (indexB in 0 until M) {
                if(listA[indexA] > listB[indexB]) ansCount++
            }
        }
        println(ansCount)
    }
}
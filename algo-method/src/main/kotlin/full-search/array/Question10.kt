package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var maxCount = 0
    var answer = 0
    for(index in 1..9) {
        val count = list.count { it == index }
        if ( maxCount < count) {
            maxCount = count
            answer = index
        }
    }
    println(answer)
}

// 別解
// val list = nums.groupingBy { it }.eachCount().toList().sortedBy { it.second }
// println(list.last().first)
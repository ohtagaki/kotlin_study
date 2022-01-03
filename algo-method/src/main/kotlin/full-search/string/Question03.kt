package `full-search`.string

fun main() {
    val S = readLine()!!.split("").toList()
    var count = 0
    for (index in 1 until S.size) {
        if(S[index - 1] == S[index]) count++
    }
    println(count)
}

// 別解
// fun main() = print(
//    readLine()?.let { S ->
//        S.toList().windowed(2).count { (a, b) -> a == b }
//    }
//)
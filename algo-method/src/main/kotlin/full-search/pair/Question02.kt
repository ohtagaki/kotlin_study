package `full-search`.pair

fun main() {
    val(L, R) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    val list = (L .. R).toList()
    list.forEach { first ->
        (first + 1..R).forEach { second
        -> if(first % 10 == second % 10) ansCount++}
    }
    println(ansCount)
}
package `full-search`.`dual-loop`

fun main() {
    val (N, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for (index in 1 .. N) {
        if (divisorNumberCount(index) == K) ansCount++
    }
    println(ansCount)
}

// 約数の個数チェックメソッド
fun divisorNumberCount(num: Int): Int {
    var count = 1
    if (num == 1) count
    for(index in 2 .. num){
        if(num % index == 0) count++
    }
    return count
}
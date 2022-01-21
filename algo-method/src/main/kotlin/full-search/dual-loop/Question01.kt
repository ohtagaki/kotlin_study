package `full-search`.`dual-loop`

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for(index in list.indices) {
        if(primeNumberCheck(list[index])) ansCount++
    }
    println(ansCount)
}

// 素数判定メソッド
fun primeNumberCheck(num: Int): Boolean {
    if (num == 1) return false
    for(index in 2 until num){
        if(num % index == 0) return false
    }
    return true
}
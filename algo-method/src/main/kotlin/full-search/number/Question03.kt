package `full-search`.number

fun main() {
    val N = readLine()!!.toInt()
    println(if(primeNumberCheck(N)) "Yes" else "No")

}

// 素数判定チェック
// 1は素数ではない
fun primeNumberCheck(num: Int): Boolean {
    if (num == 1) return false
    for(index in 2 until num){
        if(num % index == 0) return false
    }
    return true
}
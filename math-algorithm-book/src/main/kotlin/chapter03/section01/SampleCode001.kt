package chapter03.section01

// 素数判定を行うプログラム
fun main() {
    val N = readLine()!!.toLong()
    val primeCheck = isPrimeCheck(N)
    println(primeCheck)
}

// numを2以上の整数として、numが素数であればtrue,素数でなければfalseを返す
fun isPrimeCheck(num: Long) :Boolean {
    for (index in 2 until num) {
        val zero: Long = 0
        // numがindexで割り切れた場合、numはこの時点で素数ではないと判明する
        if (num % index == zero) {
            return false
        }
    }
    return true
}

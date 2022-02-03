package chapter03.section06

fun main() {
    // 入力
    val(inputA, inputB) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val gcd = GCDByRecursive(inputA, inputB)
    println(gcd)
}

// 再帰関数によるユークリッドの互除法
fun GCDByRecursive(numA: Int, numB: Int): Int{
    if (numA == 0 || numB == 0) return numA.coerceAtLeast(numB)
    return if (numA <= numB) {
        GCDByRecursive(numA, numB % numA)
    } else {
        GCDByRecursive(numA % numB, numB)
    }
}
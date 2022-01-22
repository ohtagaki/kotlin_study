package chapter02

// 10進法を2進法に変換するプログラム

fun main() {
    var N = readLine()!!.toInt()
    var answer = ""
    while (N >= 1) {
        if (N % 2 == 0) answer += "0"
        if (N % 2 == 1) answer += "1"
        N /= 2
    }
    println(answer)
}

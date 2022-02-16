package chapter05.section10

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val S = readLine()!!

    // ( の数 - ) の数をdepthとする
    // depthが0未満になった段階でNo
    var depth = 0
    var answer = true
    for (index in 0 until N) {
        if (S[index] == '(') depth += 1
        if (S[index] == ')') depth -= 1
        if (depth < 0) {
            answer = false
            break
        }
    }

    // 出力
    println(if (answer) "Yes" else "No")
}

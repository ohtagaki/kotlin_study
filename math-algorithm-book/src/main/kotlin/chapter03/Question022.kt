package chapter03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_v

fun main() {
    // 入力
    val N = readLine()!!.toLong()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    // 考え方
    // 1．巨大な配列を作成する
    // 2．各数字が何回登場するかを振り分けるために、登場する度に、配列の該当するインデックスを1ずつ追加する
    // 3. 2つの和が100000になる組み合わせの数は２で求めた回数どうしをかければ算出できるため、それを足し合わせる
    var answer = 0L
    val count = Array(100000){ 0L }
    list.map { it -> count[it] += 1L }
    for (index in 1 .. 49999) {
        answer += count[index] * count[100000 - index]
    }
    answer += count[50000] * (count[50000] - 1) / 2
    println(answer)
}

// TLEエラーが発生
// fun main() {
//    val N = readLine()!!.toInt()
//    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
//    var answer = 0
//    for (index1 in 0 until N) {
//        for (index2 in index1 + 1 until N) {
//            if (list[index1] + list[index2] == 100000L) answer++
//        }
//    }
//    println(answer)
//}
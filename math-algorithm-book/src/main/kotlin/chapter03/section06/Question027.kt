package chapter03.section06

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    var arrayA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).toIntArray()
    var arrayC: IntArray = IntArray(N)
    mergeSort(0, N, arrayA, arrayC)
    println(arrayA.joinToString(" "))
}

fun mergeSort(startNum: Int, endNum: Int, arrayA: IntArray, arrayC: IntArray) {
    // endNum - startNum = 1の場合、既にソート済み
    if (endNum - startNum == 1) return;

    // 2つに分割した後、小さい配列をソート
    val mediumNum = (startNum + endNum) / 2
    mergeSort(startNum, mediumNum, arrayA, arrayC)
    mergeSort(mediumNum, endNum, arrayA, arrayC)

    // この時点で以下の 2 つの配列がソートされている
    // 列 A' に相当するもの [A[startNum], A[startNum+1], ..., A[mediumNum−1]]
    // 列 B' に相当するもの [A[mediumNum], A[mediumNum+1], ..., A[endNum−1]]
    // マージ操作を以下で実施
    var c1 = startNum
    var c2 = mediumNum
    var count = 0
    while (c1 != mediumNum || c2 != endNum) {
        if (c1 == mediumNum) {
            // 列A'が空の場合、列B'から取ってくる
            arrayC[count] = arrayA[c2]
            c2++
        } else if (c2 == endNum) {
            // 列B'が空の場合、列A'から取ってくる
            arrayC[count] = arrayA[c1]
            c1++
        } else {
            // そのいずれでもない場合、小さい数を取得しC'に詰める
            if (arrayA[c1] <= arrayA[c2]) {
                arrayC[count] = arrayA[c1]
                c1++
            } else {
                arrayC[count] = arrayA[c2]
                c2++
            }
        }
        count++
    }
    // 配列A'・配列B'を合併した配列CをAに移す
    // [C[0], C[1], ..., C[count-1]] -> [A[startNum], A[startNum+1], ..., A[endNum-1]]
    for (index in 0 until count) {
        arrayA[startNum + index] = arrayC[index]
    }
}
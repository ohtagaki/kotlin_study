package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    // Kotlin の filterNotNull 関数を使用すると、null要素の混じった配列やリストから、null以外の要素だけを抽出する
    // forEach関数：リストや配列を、要素の数だけ順番に繰り返すループ処理
    readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        .forEach { it -> if(it % 3 == 0) println(it) }
}
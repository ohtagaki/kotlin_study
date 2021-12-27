package `receiving-input`.`multi-input`

fun main() {
    // min 関数 および max 関数 を使用すると、配列やコレクション（map を除く）の中から、最小値を持つ要素、最大値を持つ要素を取り出すことができます。
    // 数値4つの1行を受け取る
    val list: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    // maxOrNull：最大の要素を返します。要素がない場合は null を返します。
    // minOrNull：最小の要素を返します。要素がない場合は null を返します。
    println(list.maxOrNull())
}
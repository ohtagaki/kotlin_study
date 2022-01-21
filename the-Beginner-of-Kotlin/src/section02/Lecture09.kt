package section02

fun main() {
    // 文字列リテラル
    // 2種類の文字列リテラルがある
    // 1.エスケープ文字を含む文字列（Escaped String）
    // 2.改行やタブなど任意の文字列を含む文字列（Raw String）
    var msg1 = "こんにちは。\n私はKotlinを学んでいます。"
    var msg2 = """こんにちは。
        |私はKotlinを学んでいます。""".trimMargin()
    println(msg1)
    println(msg2)

    // 改行を意味する「\n」などをエスケープ文字（シーケンス）という
    // 他にもタブを意味する「\t」やバックスペースを意味する「\b」などがある

    // Kotlinの文字列リテラルの便利な機能として文字列テンプレートがある
    // 文字列テンプレートとは：文字列に任意の式を埋め込むことのできる機能
    var data = arrayOf(1,2,3)
    println("配列dataの先頭の値は${data[0]}で、要素数は${data.size}です")
    println("1+1は、${1+1}です。")
}
package section04

fun main() {
    // ラムダ式中でreturnを呼び出すと、
    // ラムダ式ではなく直上の関数を抜けてしまうことに注意
    // 以下のように書くとmain関数を抜けてしまうので、「ラムダ式を終了しました」と表示されない
    val sampleArray = arrayOf(2, 4, 6, 8)
//    sampleArray.forEach {
//        if (it == 6) return
//        println(it)
//    }
//    println("ラムダ式の終了")
    // ラムダ式だけを抜けるにはラベル構文を用いる
    // ラベル構文は、break/continue/returnなどにおいて、
    // Kotlinのデフォルトの設定とは違う場所へジャンプしたいときに使える
    sampleArray.forEach loop@{
        if (it == 6) return@loop
        println(it)
    }
    println("ラムダ式の終了")
    println("-------------------------------")
    // ラムダ式を引数にとる高階関数の名前をラベルに指定しても良い
    sampleArray.forEach {
        if (it % 4 == 0) return@forEach
        println(it)
    }

    // 高階関数はもちろん自分で定義することも可能
    // 関数を引数にするときの型宣言は以下のように書く
    // 仮引数: (受け取る関数の引数の型, ...) -> 受け取る関数の戻り値の型
    val time = benchmark("ミリ秒") {
        for ((x, i) in (1..1_000_000_000).withIndex()) {
        }
    }
    println("処理時間：$time")
}

// 例：処理時間を計測するbenchmark関数
fun benchmark(unitString: String, func: () -> Unit): String {
    val start = System.currentTimeMillis()
    func()
    val end = System.currentTimeMillis()
    return (end - start).toString() + unitString
}
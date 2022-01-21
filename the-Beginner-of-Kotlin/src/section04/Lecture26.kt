package section04

fun main() {
    val sampleArray = arrayOf(2,4,6,8)
    // 関数（メソッド）の引数に関数を渡すには、
    //「::」演算子を用いて、「::関数名」というように渡す
    sampleArray.forEach(::displayArray)
    println("-------------------------------")

    // 高階関数の引数として渡される関数（上記ではdisplayArray関数）は、この場でしか使用されないケースが多い
    // 高階関数に渡すためだけの使い捨ての関数を宣言するのは無駄が多いので、そういった場合は匿名関数（名前のない関数）を使うほうが便利
    // 匿名関数の書き方として、ラムダ式を使うのが主流
    val sampleForLambda = arrayOf(3, 6, 9, 12, 15)
    // 高階関数の唯一の引数がラムダ式なら、高階関数のカッコを省略可能
    sampleForLambda.forEach { num -> println(num)}
    println("-------------------------------")

    // ラムダ式の引数が単一なら、その引数を暗黙的な引数itで受け取ることができる
    sampleForLambda.forEach { println(it) }
}

// 引数として関数を取ったり、戻り値として関数を返す関数を高階関数と呼ぶ
// 高階関数の一例としてforEachメソッドなどがある
// 配列の要素を一つずつ取り出して引数の関数に渡していくメソッドである

fun displayArray(num :Int) {
    println(num)
}
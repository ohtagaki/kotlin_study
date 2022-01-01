package chapter02

fun main() {
    // List 2.5.2
    println(calc(5, 2))

    // List2.5.7
    displayCalcResult(10, 20, { num1, num2 -> num1 + num2 })
    displayCalcResult(10, 20, { num1, num2 -> num1 * num2 })
    displayCalcResult(390, 20) { num1, num2 -> num1 - num2 }

    // List2.6.2
    println(3.square())
    println(5.sum())
}

//関数型変数の定義
// List2.5.1
val calcSample: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }
// List2.5.3(型の省略可能)
val calc: (Int, Int) -> Int = { num1, num2 -> num1 + num2}

// List2.5.4
// 引数が1つしかない場合は引数の名前も省略可能
// その場合、引数は暗黙的にitになる
val squaredBasic: (Int) -> Int = { it * it }

// List2.5.5
// 無名関数
val squared: (Int) -> Int = fun(num: Int): Int {return num * num}

// 高階関数
// List2.5.6
fun displayCalcResult(num1: Int, num2: Int, calc:(Int, Int) -> Int) {
    val result = calc(num1, num2)
    println(result)
}

// List2.5.8
fun printAdditionResult(x: Int, y: Int) {
    println("足し算の結果を表示します")
    // List2.5.9
    displayCalcResult(x, y) { num1, num2 -> num1 + num2 }
}
fun printMultiplicationResult(x: Int, y: Int) {
    println("掛け算の結果を表示します")
    // List2.5.9
    displayCalcResult(x, y) { num1, num2 -> num1 * num2 }
}

// タイプエイリアス
// List2.5.10
typealias Calculation = (Int, Int) -> Int
// List 2.5.11
fun printCalculationResult(num1: Int, num2: Int, calculation: Calculation) {
    val result = calculation(num1, num2)
    println(result)
}

// List2.6.2
fun Int.square(): Int = this * this
fun Int.sum(): Int = this + this
package chapter01

fun main() {
    // 変数
    // 変更不可
    val id = 100
    // コンパイルエラー
    // id = 200

    //変更可能
    var name = "Author"

    // 明示的に型を定義する場合
    var sampleName: String = "sample"

    // 繰り返しメソッドの呼び出し
    whileExampleMethod()
    println("--------------------------------------------------------------------")
    forExampleMethod()
    println("--------------------------------------------------------------------")
    fotUntilStepMethod()
}
// 関数
fun countLength(str: String): Int {
    return str.length
}
// 戻り値が存在しない場合の関数
fun displayMessage(message: String) {
    println(message)
}
// Unit型の返り値
fun displayMessage2(message: String): Unit {
    println(message)
}

// 分岐
// if文
fun ifExampleMethod(num: Int) {
    if( num < 200) {
        println("Less than 200")
    } else if (num == 200) {
        println("Equal to 200")
    } else {
        println("More than 200")
    }
}
// when文
fun whenExampleMethod(num: Int) {
    when(num) {
        100 -> println("Equal to 100")
        200 -> println("Equal to 200")
        else -> println("not 100 either 200")
    }
}

// 繰り返し
// while文
fun whileExampleMethod() {
    var index = 1
    while (index < 10 ) {
        println("index is $index")
        index++
    }
}
// for文
fun forExampleMethod() {
    for(index in 1 .. 10) {
        println("index is $index")
    }
}
fun fotUntilStepMethod() {
    for (i in 1 until 20 step 5) {
        println("i is $i")
    }
}
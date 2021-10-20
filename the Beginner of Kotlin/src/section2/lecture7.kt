fun main(){

    //はじめてのKotlin
    println("Hello World!")

    //変数の宣言
    var age:Int = 25
    println(age)

    // 初期値があれば、データ型の省略可能
    var num = 10
    var m = 1.5
    println(num)
    println(m)

    // どんな型か知りたい場合
    println(num.javaClass)
    println(m.javaClass.kotlin)

    // 変数に定義したデータ型以外の型の変数を代入することは出来ない

    // 変数に任意の型を持たせたい場合はAny型を指定する
    var anything: Any
    anything = 10
    println(anything)
    anything = "なんでも"
    println(anything)
    anything = 23.5
    println(anything)

    // Kotlinではすべてのデータがオブジェクトである
    //そしてすべてのデータ型はAny型を継承している
}
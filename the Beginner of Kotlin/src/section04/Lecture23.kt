package section04

fun main() {
    // 関数の基本
    // 関数を定義するにはfunを使用する
    println(getTriangleArea(10.0, 11.0))
    sayGreeting("Taro")
    println(getSquareArea(5.0,8.0))

    // 引数と戻り値の表現方法
    println(getTriangleAreaDefault())
    println(getTriangleAreaDefault(10.0))
    // 名前付き引数
    // 名前付き引数を使えば、どの引数にどの値を渡すかを明示的に指定できる
    println(getTriangleAreaDefault(height = 4.0, width = 5.0))
    println(getTriangleAreaDefault(height = 8.0))
    // 名前付き引数には以下のようなメリットがある
    //・引数の数が増えてもどの引数になにを渡しているかがわかりやすい
    //・定義時の引数の順番による縛りがないので、呼び出しやすい・使いやすい
    // 名前付き引数を扱うときの注意点・間違えやすいところ
    // ・名前付き引数は通常の実引数の後方に記述する必要がある
    // ・必須の引数（必須引数）と省略可能な引数（任意引数）があったときは、
    // 必須引数を先頭に、任意引数を後方に並べて定義するのが良い
    println(getSquareAreaDefault(18.0))

}

// 関数の基本
// 関数を定義するにはfunを使用する
// 例：三角形の面積を求めるgetTriangleArea関数
fun getTriangleArea(width: Double, height: Double): Double {
    return width * height / 2
}
// 仮引数と戻り値の型宣言は必須であることに注意
// 戻り値がない場合は戻り値の型として、Unitを指定する
// Unit型だけは例外的に省略が可能なので、以下のように書いてもOK
fun sayGreeting(name: String){
    println("Hello, ${name}.")
}
// 単一式関数
// 関数が単一の式を返す場合は以下のように書くことができる
// コンパイラが戻り値の型を推論できる場合には、戻り値の型を省略可能
fun getSquareArea(width: Double, height: Double) = width * height

// 引数と戻り値の表現方法
// 引数のデフォルト値
// 引数が省略されたときに使用されるデフォルト値を設定することもできる
// デフォルト値を設定するには「仮引数=デフォルト値」の形で記述する
fun getTriangleAreaDefault(width: Double = 2.0, height: Double=3.0): Double{
    return width * height / 2
}
fun getSquareAreaDefault(width: Double, height: Double=3.0): Double{
    return width * height / 2
}
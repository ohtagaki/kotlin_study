package section07

import java.security.KeyStore

// ジェネリック型
// ジェネリック（プログラミング）とは：具体的なデータ型に依存しない、抽象的かつ汎用的なコード記述を可能にする手法
// 例えば配列やコレクションには要素としてどんな型でも入れることができた
// これはジェネリックプログラミングによるもの（具体的なデータ型に依存しない)

// ジェネリックプログラミングの思想
// 「定義時は具体的なデータ型に依存しないようにしておいて、
// 利用時にデータ型を設定することで、汎用的なコード記述を可能にする」という思想

fun main() {
    val generic1 = GenericExample<String>("sample")
    val generic2 = GenericExample<Int>(20)
    // 型推論ができるなら省略可能
    val generic3 = GenericExample(true)
    println(generic1.gerProperty())
    println(generic2.gerProperty())
    println(generic3.gerProperty())
}

class GenericExample<T>(var value: T) {
    fun gerProperty(): T {
        return value
    }
    // 「<T>」という記述がクラス名の後ろにあるが、これは型引数という機能
    //  型引数はその名の通り「型を受け取るための仮引数」(型引数は複数与えることも可能)
    //  あくまでも仮引数なので名前は任意だが、T（Type）やE（Element）が一般的
    //  ここで受け取った型がvalueプロパティの型とgetPropメソッドの戻り値になる
    //  ジェネリック型のクラスをインスタンス化する際に、型引数にデータ型を渡す
}

// genericExampleクラスではどんな型も渡すことができたが、渡せる型を制限したい場面もある　
// ⇒「<T: クラス名>」の形で記述する


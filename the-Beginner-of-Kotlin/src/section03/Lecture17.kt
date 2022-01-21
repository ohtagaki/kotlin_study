package section03

fun main() {
    // when式
    // 式の値に応じて処理を分岐させるには「when式」を使う
    val money = 50
    when (money) {
        5 -> println("5円玉")
        50 -> println("50円玉")
        else -> {
            println("穴の開いてない硬貨")
        }
    }
    // when式もif式と同様に式として扱うことが出来る（この場合elseは必須）
    val hitOrder = 3
    val message = when (hitOrder) {
        1,2 -> "上位打線"
        in 3..5 -> "クリーンアップ"
        in 6..8 -> "下位打線"
        9 -> "投手"
        else -> "代打"
    }
    println(message)

    // is演算子を利用することで、チェックする変数の型で処理を分岐可能
    // 変数objはAny型の定数であるのに、lengthにアクセスできていることに注目
    val obj: Any = "かきくけこ"
    when (obj) {
        is String -> println("文字数は${obj.length}です")
        else -> println("String型ではありません")
    }
    // スマートキャストとは？
    // 型チェックが行われたあとのブロックでは、該当する変数をその型として扱うことができる機能のこと、暗黙的にキャスト（型変換）を行う機能ともいえる
    // 上記の例では、is演算子によってobjは型チェックを行われたので、その後のobjはString型として扱えるようになった
    // ⇒String型のプロパティである、lengthにアクセスすることが出来ている

    // 引数を取らずに宣言すれば、if式の代替としても使える
    // 他にも関数なども条件として書くことができる
    val num = 10
    when {
        num <= 5 -> println("numは5以下です")
        num <= 10 -> println("numは10以下です")
        else -> println("numは10より大きい数です")
    }
}
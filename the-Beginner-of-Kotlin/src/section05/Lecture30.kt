package section05

// プロパティ
// Kotlinでは他の言語のようなフィールド（クラス内で定義される変数）が使えない
// フィールドの代わりにKotlinには、プロパティという機能がある
// 内部的にはフィールドと異なるが、基本的にはフィールドのように使える（前例）
// プロパティはただ単にクラスが持つ変数ではなく、それ自体がアクセサーを持つ
// アクセサーとは？ 値の取得・設定を行うシンプルなメソッドのこと。getter(取得)/setter(設定)

class HumanAndroid {
    var name = "太郎"
    var age = 20
     set(value) {
         if (value < 0) {
             println("不正な年齢です。")
         } else {
             field = value
             // アクセサーの引数は慣例的にvalueを用いる
             // fieldはバッキングフィールドと呼ばれる
             // ⇒プロパティの値を格納するために裏側で自動生成されるフィールド
             // ⇒アクセサー内部でのみ使用可能なフィールド
         }
     }

    // valを使ってプロパティを宣言すると読み取り専用のプロパティになる
    // ⇒setterを使用することはできない、getterは可能

    // private set とするとクラス外では読み取り専用、クラス内からは変更可能というように、アクセサのスコープを変更することもできる（setterのみ可能）

    fun introduce() {
        println("私の名前は、${name}です。 ${age}歳です。")
    }
}

fun main() {
    val sample = HumanAndroid()
    sample.introduce()
    sample.age = -10
    println(sample.name)
    // 「sample.age = -10」というように書くと、ageプロパティのsetterが呼び出され
    // 「sample.name」というように書くと、nameプロパティのgetterが呼び出される
    // ⇒変数にアクセスしているようだが、アクセサー（メソッド）を呼び出している
    // ⇒デフォルトの実装によりフィールドにアクセスするような振る舞いになる
}
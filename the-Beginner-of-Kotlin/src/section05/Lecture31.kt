package section05

// コンストラクタ
// Kotlinのクラスは、プライマリコンストラクタと 0個以上のセカンダリコンストラクタを持つことができる

// プライマリコンストラクタ
// クラスにひとつだけ記述できるコンストラクタで、以下のように書く
// class クラス名 constructor(引数: データ型) {}

// constructorキーワードは、プライマリコンストラクタがアノテーションや
// アクセス修飾子を持たない場合は以下のように省略可能、こちらの方が一般的
class MainHuman (var name: String,  var age: Int) {

    // コンストラクタの引数にvar/valを付けることで、
    //プロパティの宣言と初期化を同時に行うことができる
    fun introduce() {
        println("私の名前は、${name}です。 ${age}歳です。")
    }
}

fun main() {
    val jiro = MainHuman("次郎", 15)
    jiro.introduce()
}
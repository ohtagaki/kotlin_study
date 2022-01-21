package section07

// オブジェクト宣言
// 開発の場面でひとつのインスタンスしか持たないようなクラスを用意したいことがある
// Kotlinではオブジェクト宣言という仕組みによって実現できる
// (Javaなどの言語ではデザインパターンのひとつのSingletonパターンを使うのが一般的)

// 基本的な書き方
// object オブジェクト名 {オブジェクト本体}

// 既存のクラスを継承することも可能
// その場合は基底クラスのコンストラクタに値を渡して上げる必要がある

// クラスを宣言するかのようにオブジェクトを宣言可能
object TanakaTaro {
    val name = "田中太郎"
    var cloth = "シャツ"

    fun introduce() {
        println("${this.name}は、${cloth}を着ている")
    }
}
fun main() {
    TanakaTaro.cloth = "セーター"
    TanakaTaro.introduce()
}
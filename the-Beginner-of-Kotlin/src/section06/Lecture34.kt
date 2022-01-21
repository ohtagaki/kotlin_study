package section06

// 継承
// 継承とメソッドのオーバーライドを使ったコードの例
fun main() {
    val nakata = PerfectHuman("Nakata", "Tokyo")
    nakata.introduce()
    nakata.liveIn()

    // 抽象クラスと抽象メソッド
    // オーバーライドを強制するためには抽象クラスと抽象メソッドを用いる
    val takada = TekitoHuman("高田")
    takada.introduce()
}

// 継承とオーバーライドを可能にするには、open修飾子を使う必要がある

// 継承を行うには「: 基底クラス(基底クラスのコンストラクタに渡す引数)」と書く
// PerfectHumanクラスは引数としてnameとplaceを受け取る
// placeはPerfectHumanクラスのプライマリコンストラクタで初期化され、
// nameはHumanクラスのプライマリコンストラクタに渡されてそこで初期化される

//メソッドをオーバーライドするにはoverrideを使う
//基底クラスのメソッドを派生クラスから呼び出すには、「super.メソッド名()」というように呼び出す
open class Human(var name: String){
    open fun introduce() {
        println("私の名前は${this.name}です。")
    }
}

class PerfectHuman(name: String, var place: String): Human(name) {
    override fun introduce() {
        println("${this.name}は完ぺきな人間です。")
        super.introduce()
    }
    fun liveIn() {
        println("We live in ${this.place}.")
    }
}

//オーバーライドを強制するためには抽象クラスと抽象メソッドを用いる
//抽象メソッド　⇒　派生クラスでのオーバーライドを強制するメソッド
//抽象クラス　　⇒　抽象メソッドを定義できるクラス
//ポリモーフィズムを実現するためには必須の機能
abstract class NormalHuman(var name: String) {
    abstract fun introduce()
}

class TekitoHuman(name: String): NormalHuman(name) {
    override fun introduce() {
        println("どうも、有名人の${this.name}です。")
    }
}
// 上記のように書くと、NormalHumanクラスの派生クラスにintro()メソッドを オーバーライドすることを強制することができる
// 抽象メソッドには、具体的な実装を行うことが出来ないことに注意
// 空のブロックを書いているだけでエラーになる

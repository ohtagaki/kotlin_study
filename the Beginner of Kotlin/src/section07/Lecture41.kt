package section07

// コンパニオンオブジェクト
// Kotlinでクラス変数・クラスメソッド（Staticメンバ）を利用するには、クラス内部でのオブジェクト宣言である、コンパニオンオブジェクトを利用する
// → インスタンス化せずに呼び出せる変数・メソッドを宣言可能

class CompanionClass {
    // クラス内部でのオブジェクト宣言にcompanionキーワードをつける
    // コンパニオンオブジェクトの名前（Factory）は省略可能
    companion object Factory {
        fun create(): CompanionClass = CompanionClass()
    }
}

fun main() {
    // コンパニオンオブジェクト内で定義された変数やメソッドは、「クラス名.変数」「クラス名.メソッド()」というように呼び出せる
    val sample = CompanionClass.create()
    println(sample::class)
}

// 再利用しないクラスの定義　　 ⇒　オブジェクト式
// シングルトンの定義　　　　　 ⇒　オブジェクト宣言
// staticメンバの（代替の）定義　⇒　コンパニオンオブジェクト
// というように使い分けるが、プロパティの初期化のタイミングもそれぞれ異なる
// オブジェクト式　　　　　　⇒　利用時に初期化
// オブジェクト宣言　　　　　⇒　メンバにアクセスする際に初期化（遅延初期化）
// コンパニオンオブジェクト　⇒　上位のクラスの利用時に初期化
package chapter01

fun main() {
    // リスト1.5.18
    //インスタンスの生成
    val human = Human("Tanaka")
    human.showName()
}

// リスト1.5.17,18
class Human(val name: String) {
    fun showName() {
        println(name)
    }
}

// リスト1.5.19
// 継承させたいクラスには、open修飾子を付ける
open class Animal(val name: String) {
    fun showName() = println("name is $name")
    // オーバーライドさせたい関数には、openを修飾する
    open fun cries() = println(" ")
}
// リスト1.5.20,21
//　継承した子クラス
class Cat(name: String): Animal(name) {
    override fun cries() = println("cat")
}
class Dog(name: String, age: Int): Animal(name) {
    override fun cries() = println("dog")
}

// シールドクラスで継承を制限する
// sealedクラスは、他ファイルのクラスから継承できない
// 同一ファイル内で定義されたクラスでは継承可能
sealed class Platform{
    abstract fun displayName()
}

// インターフェース
interface Greeter {
    fun sayHello()
}
class GreeterImpl: Greeter {
    override fun sayHello() {
        println("Hello.")
    }
}
package section07

// ネストクラス
// Kotlinでは、classの中にclassを定義することができる
// これをネストクラス（入れ子のクラス）と呼ぶ

// 例えば、2つのクラス「Outer」と「Nested」があり、この2つのクラスはNestedがOuterに強く依存しており、NestedはOuterからしか呼ばれないとする
// このような場合、プログラム上でも仕様に準じて、NestedはOuter以外からはアクセスできないようにするのが望ましい　⇒　ネストクラスの利用

class OuterClass {
    private class Nested {
        fun show() = println("Nest is running.")
    }
    fun run() {
        val nested = Nested()
        nested.show()
    }
}

// 入れ子のクラスからアウタークラスのメンバーにアクセスしたいケースもある
// その場合はinner修飾子を付与してインナークラスとして内部のクラスを定義する
class OuterClassForAccess(val name: String = "Outer") {
    inner class NestedInner(val name: String = "Nested") {
        fun display() {
            println("${this@OuterClassForAccess.name} called display()")
            println("${this.name} is running.")
        }
    }
    fun run() {
        val nested = NestedInner()
        nested.display()
    }
}

fun main() {
    val outer = OuterClass()
    outer.run()

    val outerClass = OuterClassForAccess()
    outerClass.run()
}
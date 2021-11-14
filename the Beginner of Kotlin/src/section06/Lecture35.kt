package section06

// 単一継承だとサブクラスに必要なメソッドすべてをまとめておく必要があり、サブクラスは不要なメソッドの実装も強制されてしまうという問題がある
// ⇒インターフェースを使う
// インターフェースは抽象クラスと同様に抽象メソッドを持たせることができる
//イ ンターフェースは「継承」ではなくて、「実装」するが意味はほとんど同じ
// インターフェースを使ったコード例
interface SampleInterfaceA{
    fun sampleMethodA()
}
interface SampleInterfaceB{
    // Kotlinではインターフェース中にプロパティを定義できる
    // インターフェースは、プロパティは定義できるが状態は持てないので、以下に注意
    // ・abstractであるかアクセサーを持つ必要がある
    // ・バッキングフィールド（field）を持てない
    // カスタムアクセサーを定義する際バッキングフィールドを持てないので、他のプロパティを参照したりすることでアクセサーを記述することになる
    var word: String
    fun sampleMethodB()
    // インターフェースのメソッドがデフォルトの実装を持つ場合、 オーバーライドは強制されないことに注意
    fun sampleMethodFoo() = println("Foo")
}
interface SampleInterfaceC{
    fun sampleMethodC()
}
class SampleClassA: SampleInterfaceA,SampleInterfaceB {
    // abstractな変数wordをSampleClassAクラスでオーバーライドしている
    override var word = "sample"
    override fun sampleMethodA() {
        TODO("Not yet implemented")
    }
    override fun sampleMethodB() {
        TODO("Not yet implemented")
    }
}
class SampleClassB: SampleInterfaceB,SampleInterfaceC {
    // abstractな変数wordをSampleClassBクラスでオーバーライドしている
    override var word = "sampleB"
    override fun sampleMethodB() {
        TODO("Not yet implemented")
    }
    override fun sampleMethodC() {
        TODO("Not yet implemented")
    }
}

// インターフェースを実装するには継承と同じように「:インターフェース名」と書く
// クラスの場合はひとつのクラスしか継承できなかったが、インターフェースは複数を実装することが出来る（カンマで区切って続けて書く）
// これで、メソッドの実装を強制しつつ不要なメソッドは実装する必要がなくなる

// インターフェースは多重継承（実装）が可能なため、実装するインターフェースが同名のメソッド、かつデフォルトの実装が異なるメソッドを持つ場合が起こりうる
// このように名前が衝突した場合、実装クラスでどのような呼び出すかを明示的に指定する必要がある
// 「super<インターフェース名>」と書くことで、特定のインターフェースを指定できる
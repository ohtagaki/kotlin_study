package section05

// セカンダリコンストラクタ
// ひとつのクラスに2つ以上コンストラクタを定義する際、
// ただ一つのプライマリコンストラクタ以降はセカンダリコンストラクタとして定義
// セカンダリコンストラクタの使いどころとしては、より柔軟な記述を可能にしたり、Javaとの相互運用性を高める際に使える
class SecondHuman(var name: String, var age: Int) {
    constructor(name: String):this(name, 25) {}
    constructor():this("三郎") {}

    // 一つ目のセカンダリコンストラクタでは、ageが省略された場合、
    // 二つ目のセカンダリコンストラクタでは、nameとageのどちらも省略された場合の初期化の処理を記述している
    //「:this(実引数)」という記述がセカンダリコンストラクタにあるが、これは他のコンストラクタを呼び出すための記述

    fun introduce() {
        println("私の名前は、${name}です。 ${age}歳です。")
    }
}

// 関数と同じくコンストラクタにおいても、引数に既定値を設定できる
// 上記の例は既定値を使えば以下のようにシンプルに書ける
class SecondSimpleHuman(var name: String = "六郎", var age: Int = 18) {
    fun introduce() {
        println("私の名前は、${name}です。 ${age}歳です。")
    }
}


fun main() {
    val human1 = SecondHuman("四郎" , 20)
    val human2 = SecondHuman("五郎")
    val human3 = SecondHuman()
    human1.introduce()
    human2.introduce()
    human3.introduce()

    // 処理の流れ
    // ①「SecondHuman()」というように引数をすべて省略してインスタンス生成
    // ②引数がないので二つ目のセカンダリコンストラクタが呼び出される
    // ③「:this("三郎")」から、一つ目のセカンダリコンストラクタが呼び出される
    // ④nameに「"三郎"」が渡され、「:this(name, 25)」からプライマリコンストラクタが呼び出される
    // ⑤プライマリコンストラクタの引数nameには「"三郎"」、ageには「25」という値 が渡されて、プロパティが初期化される
    // プライマリコンストラクタが存在する場合、セカンダリコンストラクタは最終的に必ずプライマリコンストラクタを呼び出す必要があることに注意

    val human4 = SecondSimpleHuman("七郎", 17)
    val human5 = SecondSimpleHuman("八郎")
    val human6 = SecondSimpleHuman()
    human4.introduce()
    human5.introduce()
    human6.introduce()
}
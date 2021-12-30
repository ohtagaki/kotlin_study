package chapter01

fun main() {
    // リスト1.3.1
    // Null非許容・コンパイルエラーになる
    // val str1: String = null
    // Null許容
    val str2: String? = null

    //リスト1.3.8,9,10
    printMessageLength("Sample")
    printMessageLength(null)
    printMessageLength2("Weekend")
}

// リスト1.3.4
fun printMessage(message: String?) {
    // エルビス演算子
    // ?: 以降で変数がnullだった場合の処理を記述できる
    message ?: return
    println(message.length)
}

// リスト1.3.6
// Nul非許容のIntはInt?のサブタイプとして扱われる
fun execute(userId: Int?) {
    userId ?: return
    // Null非許容の引数にNull許容の引数を渡すことはできない
    createUser(userId)
}
private fun createUser(userId: Int) {}

// リスト1.3.8～10
// 安全呼び出し
fun printMessageLength(message: String?) {
    // 変数の値がnullだった場合は、nullを返す
    // nullでなかった場合は後続の処理を実行する
    println(message?.length)
}
// 強制アンラップ
// 変数の値が何があっても、問答無用に実行する
// nullが変数に入っていた場合には、実行時エラーとなる
// 仕様上確実にnullが入ってこない場合にのみ使用すべき
fun printMessageLength2(message: String?) {
    println(message!!.length)
}
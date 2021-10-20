package section2

fun main() {
    // 定数：変数のように値に名前を与えるが、一度定義したら値が変わらないもの
    // 定数を宣言するには、val命令を用いる
    // 変数は、var命令を使用する
    // 定数を変更しようとするとエラーになる
    val aNum = 25
    var bNum = 25
    var bNumChanged = 20
    println(aNum)
    println(bNum)
    println(bNumChanged)

    // 配列の場合は以下のような振る舞いになる
    val aArray = arrayOf(2,4,6)
    // aArray = arrayOf(4, 5, 6) // エラー
    aArray[2] = 8
    // 配列そのものを変更しようとするとエラーになるが、配列の要素を変更することは可能
    // 再代入が禁止されているイメージ

    // varとvalの使い分けは？
    // 再代入する予定のないものは、valを利用するのが基本
    // 変化する可能性があるものが増えると、管理が難しくなり可読性を損なう
}
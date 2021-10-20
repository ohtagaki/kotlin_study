package section02

fun main() {
    // 型変換
    // 型同士に互換性があるのであれば、必要に応じて型を変換することもできる
    // Javaではワイドニングが自動で行われるが、Kotlinでは明示的に変換する必要がある
    // ワイドニングとは：互換性がある型において、値範囲の狭い型から広い型への変換のこと
    // 例えば、Float型とDouble型を比べたときにDouble型の方が範囲が広いため、
    // Float型の数値をDouble型の数値として扱っても問題がないので変換が可能
    // Javaではワイドニングを自動的に行ってくれたが、 Kotlinでは明示的に変換する必要がある

    // サフィックス、もしくはtoデータ型()メソッドを用いて変換する
    var aNum: Float = 1.23F
    var bNum: Double = 25.0
    println(aNum)
    println(aNum::class)
    println(bNum)
    println(bNum::class)

    var cNum = 15
    var dNum: Long = cNum.toLong()
    println(cNum::class)
    println(dNum::class)
}
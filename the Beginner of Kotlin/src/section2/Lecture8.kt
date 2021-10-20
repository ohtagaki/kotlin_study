package section2

fun main() {
    // リテラルとは：ソースコードに書かれた値のこと
    // リテラル表現：ソースコード中の値の書き方・表現方法
    // 代表的な数値リテラル
    var aa = 100     // 10進数
    var bb = 0x0F    // 16進数 「0x」で始める
    var cc = 0b1010  // 2進数 「0b（0B）」で始める
    var dd = 1.23    // 浮動小数点数
    var ee = 1.23e+5 // 浮動小数点数（指数）
    println(aa)
    println(bb)
    println(cc)
    println(dd)
    println(ee)

    // 桁区切りとしてアンダースコア「_」を利用することも可能
    var aaa = 123_456_789
    var bbb = 0xAA_BB_CC
    println(aaa)
    println(bbb)

    // 以下3行のコードは意味的にすべて同じなので、最も見やすい書き方を採用するのが重要
    var a = 1000
    var b = 1_000
    var c = 0x3E8
    println(a)
    println(b)
    println(c)

    // サフィックスとは：接尾辞のこと、文字や数値の後ろに着けて意味を付与する
    var longNum = 20L // Long型として定義
    var floatNum = 20F // Float型として定義
    println(longNum::class)
    println(floatNum::class)
}


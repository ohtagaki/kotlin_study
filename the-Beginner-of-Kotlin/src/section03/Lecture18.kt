package section03

fun main() {
    // forループ
    // 反復処理を行うにはforループを用いる
    // 以下のように書くと配列arrの先頭からひとつずつ要素を取り出していく
    // 範囲演算子を用いて、指定した回数繰り返すことも可能
    val array = arrayOf(1..5)
    for (num in array) {
        print(num + "")
    }
    println()

    // Mapにも使用可能
    val forMap = mapOf("金メダル" to 1, "銀メダル" to 2, "銅メダル" to 3)
    for((key,value) in forMap) {
        println("${key}:${value}")
    }

    // 配列でもwithIndex()メソッドを用いて、インデックスと値をセットで取得できる
    val forList = listOf("松", "竹", "梅")
    for((index,value) in forList.withIndex()) {
        println("${index}：${value}")
    }

    // 範囲演算子を使うと3が含まれる（1 <= i <= 3）が、 3を含めたくない場合（1 <= i < 3）は、untilを用いる
    for (i in 1 until 3) {
        println(i)
    }
    // 範囲演算子やuntilを使うとインクリメント（1ずつ増加）されるが、
    // デクリメント（1ずつ減少）させるにはdownToを用いる
    for (num in 8 downTo 5){
        println(num)
    }
    // デフォルトでは1ずつ増加・減少するが、stepで増分・減分を指定することもできる
    for (i in 0.. 20 step 5) {
        println("5の倍数：" + i)
    }
    // ループを中断するにはbreak、周回をスキップするにはcontinueを用いる
    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
        if (i == 8)  break
    }

    // 2重ループ
    // breakとcontinueは現在のループと周回を脱出するので、以下のようになる
    for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break
            print("${i * j} ")
        }
        println()
    }
    // 「i * j」が5より大きくなった時点で、内側のループだけでなく、
    // 外側のループも終了させるには、ラベル構文を用いる
    // ①「ラベル名＠」をforの前に付ける、ラベル名は任意
    // ②break/continueの後ろに「break@ラベル名」というように指定する
    outer@ for (i in 1..4) {
        for (j in 1..4) {
            if(i * j > 10) break@outer
            print("${i * j} ")
        }
        println()
    }

}
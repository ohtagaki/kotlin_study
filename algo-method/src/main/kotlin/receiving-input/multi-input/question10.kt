package `receiving-input`.`multi-input`

fun main() {
    val S = readLine().orEmpty()
    // 複数の数字が並ぶ1列を受け取る場合
    val(N, M) = readLine()!!.split(" ").map { it.toInt() }
    val list = S.split("")
    // 連結する文字列の準備
    val builder = StringBuilder()
    // "A..B"のレンジ内で、Bを含めずにループさせる方法です。最後の数を含めない場合は、untilを使用
    for (i in 0 until N){
        builder.append(list[i])
    }
    builder.append(list[M])
    // "A..B"のレンジ内で、Bを含めずにループさせる方法です。最後の数を含めない場合は、untilを使用
    for (i in N + 1 until M){
        builder.append(list[i])
    }
    builder.append(list[N])
    // "A..B" と実装すると、Bを含めた範囲をループする
    // "A..B" と実装すると、レンジ内を1ずつインクリメントする
    if(M < S.length){
        for (i in M + 1 .. S.length){
            builder.append(list[i])
        }
    }
    println(builder)
}
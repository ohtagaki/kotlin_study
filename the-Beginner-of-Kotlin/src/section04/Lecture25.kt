package section04

fun main() {
    val (sum, average) = getSumAverage(10, 5, 4, 2)
    // ③getSumAverage関数の戻り値を(sum, average)という形で受け取っている
    // Pairの2値をsum、averageにそれぞれ代入・定義している（分解宣言）
    println(sum)
    println(average)
    // 複数の戻り値のうち一部だけ使用できれば良い場合は以下のように書く
    var (sumSample , _) = getSumAverage(1, 5, 4, 2)
    println(sumSample)
    // このように書くと平均値は使われず、合計値だけを使うことができる
    // 「_」という名前の変数が定義されるわけではないことに注意
}

// 関数から複数の戻り値を返すことも可能
// KotlinではPair（2値）とTriple（3値）を利用することで実現できる
// Pair型の戻り値を定義した関数
fun getSumAverage(vararg values:Int): Pair<Int, Double>{
    // ①戻り値の型を、Pair<Int, Double>としている
    // 2つある戻り値の1つ目の値がInt型、2つ目の値がDouble型であることを表している
    var result = 0
    var count = 0.0
    for (value in values){
        result += value
        count ++
    }
    // Pairクラスのコンストラクタに2値を渡す
    // Kotlinにおいて割り算の結果をDouble型にするには、割る数・割られる数のどちらかをDouble型にする必要がある
    return Pair(result, result / count)
    // ②戻り値を、Pair(result, result / count)としている
    // Pairクラスのコンストラクタに、戻り値とする2値を渡している
}
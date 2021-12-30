package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    // mapNotNull 関数（map と filterNotNull の一括処理）
    // コレクションの要素を map 関数で変換し、その結果から null 要素を取り除くという処理を行う場合、単純に考えると map → filterNotNull と順番に実行する

    // count()：要素数を取得できる
    //　boolean を返すラムダ式を引数に渡すことで、条件に一致した要素の数だけをカウントできる
    val answer = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).count{ it > 0 }
    println(answer)
}
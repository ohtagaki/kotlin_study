package `full-search`.array

fun main() {
    val(N, V) = readLine()!!.split(" ").map { it.toInt() }
    // count()：要素数を取得できる
    //　boolean を返すラムダ式を引数に渡すことで、条件に一致した要素の数だけをカウントできる
    val answer = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).count{it -> it == V}
    println(answer)
}
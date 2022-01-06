package `full-search`.`dual-loop`

fun main() {
    val S = readLine()!!.split("").filter { it.isNotEmpty() }.sorted()
    var count = 1
    for(index in 1 until S.size) {
        if(S[index - 1] != S[index]) count++
    }
    println(count)
}

// 別解
// distinct()：要素の重複を除外したlistを返します
// fun main() {
//    val S = readLine()!!
//	println(S.toList().distinct().count())
//}
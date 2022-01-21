package `regular-expression`.`Look-aheadOrBack`

// 問題
// https://algo-method.com/tasks/646

fun main() {
    val(N, Y, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val S = (0 until N).map{readLine()!!}
    val regex1 = Regex(pattern = "[0-9]+_.*(?=_[0-9]{8}\\.pdf)")
    S.forEach { println(it.replace(Regex("_[0-9]{8}\\.pdf"), "").replace(Regex("^[0-9]+_"), ""))}
}

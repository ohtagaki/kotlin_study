package `everyDay-algoMethod`.`greedy-algorithm`

fun main() {
    // 方針： 「大きな額のコインから優先的に使う」という素朴な直感に基づく解法
    val N = readLine()!!.toInt()
    // 5 円玉で払えるだけ払って、残りを 1円玉で払う
    val countOfFive = N / 5
    val countOfOne = N % 5
    println(countOfFive + countOfOne)
}
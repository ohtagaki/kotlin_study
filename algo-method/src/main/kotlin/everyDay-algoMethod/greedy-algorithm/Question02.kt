package `everyDay-algoMethod`.`greedy-algorithm`

fun main() {
    var N = readLine()!!.toInt()
    var count = 0
    while (N > 0) {
        if (N % 2 == 0) {
            N /= 2
            count++
        } else {
            N -= 1
            count++
            if (N == 0) break
            N /= 2
            count++
        }
    }
    println(count)
}
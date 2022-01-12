package `everyDay-algoMethod`.`greedy-algorithm`

fun main() {
    var X = readLine()!!.toInt()
    val(A,B,C,D) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var count = 0
    if (X >= 50) {
        A.coerceAtMost(X / 50)
        count += A.coerceAtMost(X / 50)
        X -= count * 50
    }
    if (X >= 10) {
        val countOfTen = if ( B > X / 10 && X / 10 == 0 ){
            X % 10
        } else {
            B.coerceAtMost(X / 10)
        }
        count += countOfTen
        X -= countOfTen * 10
    }
    if (X >= 5) {
        val countOfFive = if ( C > X / 5 && X / 5 == 0 ){
            X % 5
        } else {
            C.coerceAtMost(X / 5)
        }
        count += countOfFive
        X -= countOfFive * 5
    }
    if (X >= 1) {
        count += D.coerceAtMost(X)
    }
    println(count)
}
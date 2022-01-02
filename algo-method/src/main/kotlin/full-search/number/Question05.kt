package `full-search`.number

fun main() {
    val N = readLine()!!.toInt()
    // FizzBuzz
    (1..N).toList().forEach {
        it -> if (it % 3 == 0 && it % 5 == 0) {
            println("FizzBuzz")
        } else if (it % 3 == 0) {
            println("Fizz")
        } else if (it % 5 == 0) {
            println("Buzz")
        } else {
            println(it)
        }
    }
}
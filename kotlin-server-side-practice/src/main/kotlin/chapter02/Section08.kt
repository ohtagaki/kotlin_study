package chapter02

fun main() {
    val num = Num(6) + Num(2)
    println(num)
}

data class Num(val value: Int) {
    operator fun plus(num: Num): Num {
        return Num(value + num.value)
    }
}

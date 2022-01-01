package chapter02

fun main() {
    // List2.1.3
    printOddOrEvenNumber(5)
    printOddOrEvenNumber(10)

    // List2.1.5
    printOddOrEvenNumberText(7)
    printOddOrEvenNumberText(16)

    // List2.1.8
    printNumText(3)
    printNumText(10)
}

// List2.1.1-4
fun printOddOrEvenNumber(num: Int) {
    var text = if (num % 2 == 1) "奇数" else "偶数"
    println(text)
}

// List2.1.5-6
fun printOddOrEvenNumberText(num: Int): String {
    return if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }
}

// List2.1.7
fun printNumText(num: Int) {
    var text = when (num) {
        10 -> "Equal to 10"
        20 -> "Equal to 20"
        else -> "Other Number"
    }
}
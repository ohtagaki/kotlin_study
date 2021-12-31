package chapter02

import kotlinx.coroutines.*


fun main() {
    // List2.11.2
    GlobalScope.launch {
        delay(1000L)
        println("Naoto.")
        println("-------------------------------------------------------")
    }
    println("My name is")
    Thread.sleep(2000L)

    // List2.11.3
    runBlocking {
        launch {
            delay(1000L)
            println("Yuta.")
            println("-------------------------------------------------------")
        }
        println("My name is")
    }
    // List2.11.6
    runBlocking {
        launch { printName() }
        println("My Name is")
    }
    // List2.11.7
    runBlocking {
        val result = async {
            delay(2000L)
            var sum = 0
            for (i in 1..10){
                sum += i
            }
            sum
        }
        println("計算中")
        println("sum=${result.await()}")
        println("-------------------------------------------------------")
    }

    // List2.11.8
    runBlocking {
        val num1 = async {
            delay(2000L)
            1 + 2
        }
        val num2 = async {
            delay(1000L)
            3 + 5
        }
        println("sum=${num1.await() + num2.await()}")
    }
}

// List 2.11.5
suspend fun printName() {
    delay(1000L)
    println("Machico")
    println("-------------------------------------------------------")
}
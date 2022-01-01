package chapter03

import HelloByJava
import java.time.LocalDateTime
import java.util.*

fun main() {
    val hello = HelloByJava()
    hello.printHello()

    // List3.2.1
    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    // List3.2.2
    val nowTime = Time(LocalDateTime.now())
    println(nowTime)

    // List3.2.3
    val dog = DogKotlin()
    dog.cry()

    // List3.3.6
    val greeter = GreeterImplKotlin()
    greeter.hello()
}

// List3.2.2
data class Time(val time: LocalDateTime)

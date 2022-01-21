package chapter02

import java.net.Inet4Address

fun main() {
    // List.2.7.1-3
    val oddNumbers = with(mutableListOf<Int>()) {
        for (i in 1 ..10) {
            // thisは省略可能
            if(i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = ",")
    }
    println(oddNumbers)
    println(oddNumbers.javaClass)
    println("-------------------------------------------------------")

    // List2.7.4
    val evenNumbers = mutableListOf<Int>().run {
        for (i in 1..10) {
            if ( i % 2 == 0) this.add(i)
        }
        this.joinToString(separator = ",")
    }
    println(evenNumbers)
    println(evenNumbers.javaClass)
    println("-------------------------------------------------------")

    // List2.7.6
    val oddNumbersOfLet = mutableListOf<Int>().let{ list ->
        for (i in 1..10) {
            if (i % 2 == 1) list.add(i)
        }
        list.joinToString(separator = " ")
    }
    println(oddNumbersOfLet)
    println(oddNumbersOfLet.javaClass)
    println("-------------------------------------------------------")

    // List2.7.8
    println(createUser("Tanaka"))
    println(createUser(null))
    println("-------------------------------------------------------")

    // List2.7.11
    val evenNumbersOfApply = mutableListOf<Int>().apply {
        for (i in 1..10) {
            if(i % 2 == 0) this.add(i)
        }
        this.joinToString(separator = "")
    }
    println(evenNumbersOfApply)
    println(evenNumbersOfApply.javaClass)
    println("-------------------------------------------------------")

    // List2.7.13
    updateUser(200, "Java", "Tokyo")

    // List2.7.16
    updateUserLocal(100, "Kotlin", "Nagoya")
}

// List2.7.5
data class User(var name: String)
fun getUserString(user: User?, newName: String): String? {
    return user?.run {
        name = newName
        toString()
    }
}

// List2.7.7
fun createUser(name: String?): User? {
    return name?.let { n -> User(n) }
}
// List2.7.10
fun createUser2(name: String?): User? {
    return name?.let { User(it) }
}
// List2.7.12
data class ApplyUser(val id: Int, var name: String, var address: String)
fun getUser(id: Int): ApplyUser {
    return ApplyUser(id, "Okazaki", "Aichi")
}
fun updateUser(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).apply {
        this.name = newName
        this.address = newAddress
    }
    println(user)
}
// List2.7.15
fun updateUserLocal(id: Int, newName: String, newAddress: String) {
    var name = ""
    val user = getUser(id).apply {
        name = newName
        address = newAddress
    }
    println(user)
}
// List2.7.17,18
fun updateUserOfAlso(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).also { user ->
        user.name = newName
        user.address = newAddress
    }
    println(user)
}

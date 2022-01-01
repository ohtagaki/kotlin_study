package chapter02

fun main() {
    // List2.4.2
    printUserInfo(2)
    // list2.4.3
    printUserInfo(3, "Author3")

    // List2.4.5
    val user8 = User8(8)
    println(user8.toString())

    // List2.4.7
    val user9 = User9(id = 9, age = 25)
    println(user9.toString())

}

fun printUserInfo(id: Int, name: String = "Default Name") {
    println("id = $id name = $name")
}

// List2.4.4
data class User8(val id: Int, val name: String = "Default Argument")

// 名前付き引数
// List2.4.6
data class User9(val id: Int, val name: String = "Default Argument", val age: Int)
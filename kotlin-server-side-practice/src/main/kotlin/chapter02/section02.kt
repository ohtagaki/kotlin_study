package chapter02

fun main() {
    // List2.2.2
    val user1 = User1()
    user1.name = "Shimasa"
    // プロパティの値の取得に関しては、nameのgetterを経由して、nameの値を取得している
    println(user1.name)

    // List2.2.5
    val user2 = User2(1)
    user2.name = "Takehata"
    // コンパイルエラーになる
    // user2.id = 2

    val user3 = User3()
    // 実行時エラー
    // println(user3.name)

    // List2.2.9
    val user4 = User4()
    user4.name = "Okugawa"
    println(user4.isValidName)

    // List2.2.11
    val user5 = User5()
    user5.name = ""
    println(user5.name)
    user5.name = "Java"
    println(user5.name)
}

// List2.2.1
// 内部的にはnameのsetterメソッドを呼び出して、nameに値が格納されている
class User1 {
    var name: String = ""
}

// List2.2.4
class User2(id: Int) {
    val id: Int = id
    var name: String = ""
}

// List2.2.6
class User3 {
    lateinit var name: String
}

// List2.2.8
class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}

// List2.2.10
class User5 {
    var name: String = ""
        set(value) {
            if (value == "") {
                field = "Kotlin"
            } else {
                field = value
            }
        }
}
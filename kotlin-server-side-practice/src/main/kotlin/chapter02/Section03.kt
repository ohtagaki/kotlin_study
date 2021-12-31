package chapter02

fun main() {
    // List2.3.4
    val userA = User6()
    val userB = User6()
    println(userA.toString())
    println(userB.toString())
    println(userA == userB)
    val set = hashSetOf(userA)
    println(userA.hashCode())
    println(userB.hashCode())
    println(set.contains(userB))

    println("-------------------------------------------------------")
    // List2.3.6
    val user6 = User7(1, "Author1")
    user6.name = "Kotlin"
    println(user6.name)
    // List 2.3.7
    val user7 = User7(1, "Author1")
    val same = User7(1, "Author1")
    val other = User7(2, "Author2")
    println(user7 == same)
    println(user7 == other)
    // List2.3.8
    println("user=${user7.hashCode()}")
    println("same=${same.hashCode()}")
    println("other=${other.hashCode()}")
    val set8 = hashSetOf(user7)
    println(set8.contains(same))
    println(set8.contains(other))
    // List2.3.9,10
    val user9 = User7(9, "Author9")
    println(user9.toString())
    println(user9.component1())
    println(user9.component2())
    // List2.3.11
    val updatedUser9 = user9.copy(99, "Author99")
    println(updatedUser9.toString())
    // List2.3.12
    println(user9.isValidName)
}

// List2.3.1-4
class User6 {
    val id: Int = 1
    val name = "Kotlin"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as User6
        if (id != other.id) return false
        if (name != other.name) return false
        return true
    }
    override fun hashCode(): Int {
        return 31 * name.hashCode() + id
    }
    override fun toString(): String {
        return "User6(id=$id, name=$name)"
    }
}

// データクラスの定義
data class User7(val id: Int, var name: String) {
    val isValidName: Boolean
        get() = name != ""
}
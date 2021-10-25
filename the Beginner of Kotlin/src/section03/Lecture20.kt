package section03

fun main() {
    // while/do while ループ
    // 条件式を満たす間は実行するwhileループもある
    var num = 1
    while (num < 2) {
        println(num)
        num++
    }
    // do whileループは条件式の判定が処理の後になる
    // do whileループはパスワードの入力などに使える
    var doNum = 1
    do {
        println(doNum)
        doNum++
    }while (doNum < 4)
}
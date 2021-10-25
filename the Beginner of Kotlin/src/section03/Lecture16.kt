package section03

fun main() {
    // if文：条件分岐を表現する
    // 基本的な書き方
    // elseとelse ifは省略可能、{ }の中には複数行の記述も可能
    val num = 15
    if (num < 10) {
        println("numは10未満です")
    }else if(num < 20) {
        println("numは20未満です")
    } else {
        println("numは20以上です")
    }

    // Kotlinにおいて「if」は「式」であるので、値を返すことができる
    // ifを式として用いた場合は何らかの値を返す必要があるので、elseは省略できない
    // { }の中には複数行の記述も可能、その場合最後に書いた値を戻り値とみなす
    val money = 3200
    val message = if (money < 1000){
        "1000円でおつりが来ます"
    } else if (money < 5000) {
        "5000円でおつりが来ます"
    }else{
        "5000円以上です"
    }
    println(message)

    // 処理を一文しか書かないならば、{ }は省略可能なので以下のようにも書ける
    val age = 14
    val msg = if(age < 12) "小学生" else if(age < 15) "中学生" else "義務教育終わり"
    println(msg)
}
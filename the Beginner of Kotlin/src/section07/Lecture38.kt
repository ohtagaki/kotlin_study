package section07

fun main() {
    val member1 = MemberForEqualCheck("山本")
    member1.age = 25
    val member2 = MemberForEqualCheck("山本")
    member2.age = 30
    // equalsメソッド（同値性のチェック）
    // ⇒プライマリコンストラクタで定義されたプロパティが等しいかを確認する
    // ageプロパティはプライマリコンストラクタで定義されていないので、ageプロパティの値が同じでなくてもtrueを返す
    println(member1 == member2)

    // toStringメソッド（文字列化）
    // ⇒文字列表現、println関数を呼び出したときにも暗黙的に呼び出されている
    //データクラスのオブジェクトを文字列化すると、「データクラス名(プロパティ1=値, ...)」というように出力される
    println(member1)
    // equalsメソッドと同様に、プライマリコンストラクタで定義されていない プロパティは出力されていないことに注目
    // ⇒データクラスに用意されるメソッドは、プライマリコンストラクタで定義されたプロパティだけを対象にしている

    // componentN（分割代入）
    // ⇒プロパティの値を個々の変数に分解する
    // →データクラスにはcomponentNが実装されている
    // →データクラスのオブジェクトは分割代入が可能
    val member3 = MemberForComponentN("伊藤", "営業", 27)
    val (name, job, age) = member3
    println(job)

    // copy（オブジェクトの複製）
    // ⇒特定のプロパティの値だけを変更した上でオブジェクトの複製を可能にする
    val member4 = MemberForComponentN("赤坂", "営業", 25)
    val member5 = member4.copy(name="渋谷" , age = 35)
    println(member5)
}


// データクラス
// オブジェクト指向で設計・開発をしていると、 処理を持たないデータだけを保持するクラスが生まれることもある
// そういったクラスを表現するための仕組みがデータクラス
// データクラスはclassの前に「data」というキーワードをつけて定義する
data class Member(
    val name: String,
    val age: Int
)

data class MemberForEqualCheck(var name: String = "") {
    var age: Int = 0
}

data class MemberForComponentN(
    var name: String,
    val job: String,
    val age: Int)
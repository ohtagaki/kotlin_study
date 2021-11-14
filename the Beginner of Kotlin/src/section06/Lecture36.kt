package section06

// 型変換
// 型同士が継承・実装の関係にある場合は、相互に型変換（キャスト）が可能
open class SamplePerson {}
class BusinessPerson: SamplePerson() {
    fun work() = println("Working")
}

fun main() {
    // アップキャスト
    val person: SamplePerson = BusinessPerson()
    // ダウンキャストを行うには、型のチェックが必要
    if (person is BusinessPerson) {
        // スマートキャスト
        // ブロック内では明示的なキャストを省略可能
        person.work()
    }
}

// 派生クラス⇒基底クラスのキャストをアップキャスト、
// 基底クラス⇒派生クラスのキャストをダウンキャストと呼ぶ

// アップキャストはいつでも可能なのに対して、ダウンキャストはできない場合あり
// ⇒派生クラス(サブクラス)独自のメンバがある場合はできない
// ⇒is演算子による型チェックが必要
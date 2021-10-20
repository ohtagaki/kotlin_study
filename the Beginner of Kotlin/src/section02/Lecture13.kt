package section02

fun main() {
    // 配列とコレクション
    // Kotlinで複数の要素をまとめて扱うには、Javaと同様に配列とコレクションを用いる
    // 配列と代表的なコレクション（List・Set・Map）は以下のような特徴がある
    // 配列：最もシンプルな複数の要素を扱う仕組みだが、宣言の段階でサイズを決める必要があるなど柔軟性に欠ける
    // List：配列と同様に複数の要素を扱うことができる、インデックスを指定して値を取得・設定ができる
    // Set：Listと似ているが重複した要素は登録しないので、重複のない複数の要素を扱うことが出来る、順序性はないのでインデックスを指定した値の取得・設定は出来ない
    // Map：キーと値を利用して要素を扱う、他の言語では連想配列・辞書（ディクショナリ）と呼ばれることもある

    // Kotlinの配列はArrayクラスで表現される
    // 「Array<String?>」は、「要素がString?型の配列」を意味し、要素にnullが入るので明示的にNullable型を指定する必要がある
    val aArray = arrayOf(4,5,6)
    println(aArray[2])
    var BIntArray = intArrayOf(4,5,6)

    // arrayOfNulls()関数を指定した要素数の空の配列を作成できる
    var cArray: Array<String?> = arrayOfNulls(4)

    // Arrayクラスのコンストラクタを使った書き方もある
    // 第1引数は要素数、第2引数は要素の式（ラムダ式、後ほど説明）
    // iがインデックスを表すので、インデックスがiの要素の値はi*2という宣言をしている
    var dArray = Array(4, {num -> num * 3})
    for(i in dArray.indices) {
        print(dArray[i])
        print("　")
    }

    // コレクション
    // 各種コレクションは以下のように生成できる
    // 以下のようにコレクションを作成すると読み取り専用になる
    var list = listOf<String>("あ", "い", "う", "え" ,"お")
    var set = setOf(1,2,3,4,5)
    var map = mapOf("1番" to 1, "2番" to 2, "3番" to 3)
    println(list)
    println(set)
    println(map)
    // 変更可能なコレクションを作成するには、mutableコレクション名Of()関数を使う
    var listMutable = mutableListOf(2,4,6,8,10)
    println(listMutable)
    listMutable[3] = 7
    listMutable[4] = 12
    println(listMutable)

    // 通常のListがimutable（変更不可能）なわけではないことに注意
    // 以下のような記述をすれば、Listも変更される
    var listMutable2 = mutableListOf(2,4,6,8,10)
    var list2: List<Int> = listMutable2
    listMutable2[0] = 1
    listMutable2[2] = 5
    println(list2)

}
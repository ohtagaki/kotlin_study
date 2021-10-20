package section2

fun main() {
    // nullとは：値(オブジェクトの参照)を持たないことを意味する値
    // オブジェクトの参照とは
    // 値（オブジェクト）はコンピュータのメモリに格納されることで状態を保持できる
    // オブジェクトごとにメモリ上の住所（メモリアドレス）が与えられる
    // ひとつの住所にひとつのオブジェクトが入っている状態

    // 変数：メモリアドレスを参照して格納されている値を引き出すための仕組み
    // 変数にオブジェクトの参照が設定されていない状態がnullである
    // Kotlinでは原則「nullを許容しない」ように作られている
    // あえてnullを許容したいときは、型名の後ろに「?」を付ける
    // このような型をNullable型（null許容型）と呼び、Stringに限らずNullable型として定義することができる
    var fooNullable: String? = "fooSample"
    println(fooNullable)
    fooNullable = null
    println(fooNullable)

    // Nullable型はnullが入っている可能性があるので取り扱いには注意が必要
    // 特に以下の3点に注意する必要がある
    // ①非null型をNullable型に代入すると暗黙的な型変換（ボクシング）が発生する
    // ②Nullable型を非null型に代入することはできない
    // ③Nullable型のメンバにアクセスする際には「?.（セーフコール演算子）」を使う

    // ①非null型をNullable型に代入すると暗黙的な型変換（ボクシング）が発生する
    // 変数aを、非null型の変数bと、Nullable型の変数cにそれぞれ代入している
    // 同じ値を持つことを同値、同じオブジェクトであることを同一という
    // 同値性の比較には「==」、同一性の比較には「===」という演算子を用いる
    // aとbは同じオブジェクトなので同値かつ同一
    // 一方で、aとcは下二行からもわかるように、同値だが同一ではない
    // ⇒　暗黙的な型変換（ボクシング）が発生して別のオブジェクトになっている
    var a: Int = 10000
    var b: Int = a
    var c: Int? = a
    println(a == b)
    println(a == c)
    println(a === b)
    println(a === c)

    // ②Nullable型を非null型に代入することはできない
    // Nullable型である「Any?」に変更するとエラーが解消される
    // Any型を指定すると任意の型を代入できるという話をしたが、 厳密には「Any型を指定すると任意の非null型を代入できる」、
    // かつ「Any?型を指定するとnull型を含む任意の型を代入できる」と言える

    // ③Nullable型のメンバにアクセスする際には「?.（セーフコール演算子）」を使う
    var aa: String? ="sample"
    println(aa?.length)
    var bb: String? = null
    println(bb?.length)
    // nullの場合に返す既定値を設定するには「?:」演算子を使う
    var cc: String? = null
    println(cc?.length ?: "nullです")
    // Nullable型を非null型に変換するには「!!」演算子を使う
    var dd: String? = "fooSample"
    println(dd!!.length)
    // ただし、上記の例でddがnullだった場合にはNullPointerExceptionが発生するので、
    // Nullable型の値がnullでないことが保証されている際にしか利用してはいけない


}
package chapter04.section03

// ニュートン法の実装例
fun main() {
    val radius = 2.0
    // √2に近づける値
    var a = 2.0

    for (index in 1..5) {
        // 点(a, f(a)) のx座標とy座標を求める
        val coordinateX = a
        val coordinateY = a * a

        // 接線の傾きを求める
        val tangentA = 2.0 * coordinateX
        val tangentB = coordinateY - tangentA * coordinateX

        // 次のaを求める
        val next_a = (radius - tangentB) / tangentA
        println("√2の近似値：$next_a")
        a = next_a
    }
}

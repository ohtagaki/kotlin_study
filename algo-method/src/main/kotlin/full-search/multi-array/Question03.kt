package `full-search`.`multi-array`

fun main() {
    val(X, Y, Z) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listC = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for (indexC in 0 until Z) {
        for (indexA in 0 until X) {
            for (indexB in 0 until Y) {
                if (listA[indexA] + listB[indexB] == listC[indexC]) ansCount++
            }
        }
    }
    println(ansCount)
}


// 別解
// fun main() = print(
//    readInts { (X: Int, Y: Int, Z: Int) ->
//        readInts { arrayA -> // size X
//            readInts { arrayB -> // size Y
//                readInts { arrayC -> // size Z
//                    // Ai + Bj = Ckとなる組みの個数を求めよ
//                    arrayA.sumOf { ai -> arrayB.sumOf { bj -> arrayC.count { ck -> ai + bj == ck } } }
//                }
//            }
//        }
//    }
//)
//
//fun <T> readInts(block: (List<Int>) -> T): T? = readLine()?.split(" ")
//    ?.mapNotNull { it.toIntOrNull() }?.let(block)
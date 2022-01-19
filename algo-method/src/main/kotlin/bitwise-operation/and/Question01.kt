package `bitwise-operation`.and

fun main() {
    // length で指定した長さに足りない場合、padChar で start/end を埋めたものを返す
    println((0b11010 and 0b01011).toString(2).padStart(5,'0'))
}
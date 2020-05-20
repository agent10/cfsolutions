package r481_div3_A

import java.lang.Long.max


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    readInt()
    val arr = readIntArray()

    val map = arr.groupingBy { it }.eachCount().toMutableMap()
    val res = mutableListOf<Int>()
    arr.forEach {
        if (map[it] == 1) res += it
        else {
            map[it] = map[it]!! - 1
        }
    }

    println(res.size)
    println(res.joinToString(" "))
}
package r647_div2_B

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        readInt()
        val arr = readIntArray().sorted()
        var r = arr[0]
        for (i in 1 until arr.size) {
            r = r xor arr[i]
        }
        if(r == 0) {
            println(-1)
        } else {
            println(r)
        }
    }
}
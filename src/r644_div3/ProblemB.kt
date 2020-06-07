package r644_div3_B

import kotlin.math.abs
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

        var min = arr.last() - arr.first()
        for (i in 0..arr.size - 2) {
            val diff = abs(arr[i] - arr[i + 1])
            if (diff < min) {
                min = diff
            }
        }

        println(min)
    }
}
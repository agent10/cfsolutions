package r644_div3_A

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (a, b) = readIntArray()
        println(maxOf(2 * minOf(a, b), maxOf(a, b)).toFloat().pow(2).toInt())
    }
}
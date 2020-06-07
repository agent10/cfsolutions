package edr88_div2_A

import kotlin.math.ceil
import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, m, k) = readIntArray()
        val c = n / k
        val r1 = minOf(c, m)
        var r2 = ((m - r1) / (k - 1))
        if ((m - r1) % (k - 1) != 0) r2++
        println(r1 - r2)
    }
}
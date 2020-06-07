package kotlin_heroes_4_contest_B

import java.lang.Long.max
import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, k1, k2) = readIntArray()
        val arr = readString()
        var last = 0
        var m = 0
        arr.forEach {
            if (it == '0') {
                last = 0
            } else {
                if (last == 0) {
                    m += k1
                    last = k1
                } else {
                    val h = minOf(k1, maxOf(k2 - last, 0))
                    m += h
                    last = h
                }
            }
        }

        println(m)
    }
}
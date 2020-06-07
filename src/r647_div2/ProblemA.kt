package r647_div2_A

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (a, b) = readLongArray()

        val b1 = maxOf(a, b)
        val a1 = minOf(a, b)
        var d = b1 / a1
        if (b1 % a1 == 0L && d and (d - 1) == 0L) {
            var c = 0
            while (d > 0) {
                if (d % 2 == 0L) {
                    c++
                }
                d /= 2

            }
            var r = 0
            while (c > 0) {
                c -= when {
                    c >= 3 -> {
                        3
                    }
                    c >= 2 -> {
                        2
                    }
                    else -> {
                        1
                    }
                }
                r++
            }
            println(r)
        } else {
            println(-1)
        }
    }
}
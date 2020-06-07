package edr88_div2_C

import kotlin.math.ceil
import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val k = readInt()
    repeat(k) {
        val (h, c, t) = readIntArray()

        var hc = 1
        var cc = 0

        fun calc(): Float {
            return (hc * h.toFloat() + cc * c.toFloat()) / hc + cc
        }

        var minT = Float.MAX_VALUE
        while (true) {
            if (hc > cc) {
                cc++
            } else {
                hc++
            }
            val calc = calc()
            if (calc > t) {
                break
            }
        }

        println(hc + cc)
    }
}
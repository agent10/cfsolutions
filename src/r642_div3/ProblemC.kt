package r642_div3

import helpers.readInt
import helpers.readLong
import kotlin.math.*

fun main() {
    val t = readInt()
    repeat(t) {
        val n = readLong()
        var last = 0L
        for (k in 1L..((n + 1L) / 2L)) {
            val steps = (k - 1L)
            val c = (k - 1) * 8L
            last += ((c * steps))
        }
        println(last)
    }
}
package r642_div3

import kotlin.math.*

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toLong()
        var last = 0L
        for (k in 1L..((n + 1L) / 2L)) {
            val steps = (k - 1L)
            val c = (k - 1) * 8L
            last += ((c * steps))
        }
        println(last)
    }
}
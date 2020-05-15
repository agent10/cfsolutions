package r642_div3

import helpers.readInt
import helpers.readLongArray
import kotlin.math.*

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, k) = readLongArray()
        val a = readLongArray().sorted()
        var maxSum = a.sum()
        val b = readLongArray().sortedDescending()
        repeat(k.toInt()) {
            if (b[it] > a[it]) {
                maxSum += (b[it] - a[it])
            }
        }

        println(maxSum)
    }
}
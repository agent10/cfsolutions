package r642_div3

import helpers.readInt
import helpers.readLongArray

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, m) = readLongArray()
        when (n) {
            1L -> {
                println("0")
            }
            2L -> {
                println(m)
            }
            else -> {
                println(m * 2)
            }
        }
    }
}
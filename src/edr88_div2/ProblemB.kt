package edr88_div2_B

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
        val (n, m, x, y) = readIntArray()
        var sum = 0
        val dib = 2 * x < y
        repeat(n) {
            val row = readString()
            if (row.length == 1 && row[0] != '*') {
                sum += x
            }
            var i = 0
            while (i <= row.length - 2) {
                if (row[i] == row[i + 1]) {
                    if (row[i] != '*') {
                        sum += if (dib) 2 * x else y
                    }
                    i += 2
                } else {
                    if (row[i] != '*') {
                        sum += x
                    }
                    i++
                }
            }
            if (row.length != 1 && i == row.length - 1 && row[i] != '*') {
                sum += x
            }
        }

        println(sum)
    }
}
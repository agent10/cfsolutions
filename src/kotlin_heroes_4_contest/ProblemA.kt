package kotlin_heroes_4_contest_A

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
        val (n, k) = readLongArray()
        val m = 1 + k + k * k + k * k * k
        val n1 = n / m
        val n2 = k * n1
        val n3 = k * n2
        val n4 = k * n3

        println("$n1 $n2 $n3 $n4")
    }
}
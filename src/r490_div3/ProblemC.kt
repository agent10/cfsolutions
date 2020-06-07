package r490_div3_C

import java.lang.Long.max
import kotlin.system.measureTimeMillis

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {

    var (n, k) = readIntArray()
    val s = readString()

    val map = s.toList().sorted().take(k).groupingBy { it }.eachCount().toMutableMap()

    val res = mutableListOf<Char>()
    s.forEach {
        if (map[it] ?: 0 > 0) {
            map[it] = (map[it]!! - 1)
        } else {
            res.add(it)
        }
    }

    println(res.joinToString(""))
}
package r481_div3_D

import java.lang.Long.max
import kotlin.math.abs


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    readInt()
    val arr = readLongArray()
    if (arr.size <= 2) {
        println(0)
        return
    }

    val set = mutableListOf<Long>()
    for (i in 0..arr.size - 2) {
        set += arr[i + 1] - arr[i]
    }

    println(set)

    val map = set.groupingBy { it }.eachCount()
    val maxCountDiff = map.maxBy {
        it.key
    }

    var c = 0
    map.filterKeys {
        it != maxCountDiff!!.key
    }.forEach {
        if (it.key != maxCountDiff!!.key) {
            c += it.value
        }
    }
    println(c)
}
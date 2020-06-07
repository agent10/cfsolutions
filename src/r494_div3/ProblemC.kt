package r494_div3_C

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val arr = readIntArray()
    val res = arr.groupingBy {
        it
    }.eachCount().maxBy {
        it.value
    }!!.value
    println(res)
}
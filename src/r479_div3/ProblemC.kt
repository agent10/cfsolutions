package r479_div3_C

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val (n, k) = readIntArray()
    val arr = readLongArray().sorted().toMutableList()
    if (k == 0) {
        val a = arr.first() - 1
        if (a == 0L) {
            println(-1)
        } else {
            println(a)
        }
    } else if (arr.size < k) {
        println(-1)
    } else if (arr.size == k) {
        println(arr.last())
    } else {
        if (arr[k - 1] == arr[k]) {
            println(-1)
        } else {
            println(arr[k - 1])
        }
    }
}
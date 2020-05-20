package r486_div3_A

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val (n, k) = readIntArray()
    val arr = readIntArray()

    val set = arr.toSet()

    if (set.size < k) {
        println("NO")
    } else {
        println("YES")
        val res = mutableListOf<Int>()
        set.take(k).forEach {
            res += (arr.indexOf(it) + 1)
        }
        println(res.joinToString(" "))
    }
}
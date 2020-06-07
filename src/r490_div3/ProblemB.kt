package r490_div3_B

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    var s = readString()
    for (i in 1..n) {
        if (n % i == 0) {
            s = s.take(i).reversed() + s.takeLast(n - i)
        }
    }
    println(s)
}
package r479_div3

import java.lang.Long.max


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    var (n, k) = readLongArray()
    repeat(k.toInt()) {
        if (n % 10L == 0L) {
            n /= 10L
        } else {
            n -= 1L
        }
    }

    println(max(1, n))
}
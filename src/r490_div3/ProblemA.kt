package r490_div3_A

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val (n, k) = readIntArray()
    val p = readIntArray()
    val fi = p.indexOfFirst {
        it > k
    }
    if (fi == -1) {
        println(p.size)
    } else {
        val li = p.indexOfLast {
            it > k
        }
        println(p.size - (li - fi + 1))
    }
}
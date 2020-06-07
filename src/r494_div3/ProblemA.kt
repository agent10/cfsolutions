package r494_div3_A


import java.lang.Long.max
import java.util.*

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    var (a, b, x) = readIntArray()
    val res = LinkedList<Int>()
    val c = if (x % 2 == 0) x - 1 else x
    for (i in 0..c) {
        val r = (i % 2)
        res += r
        if (r == 0) a-- else b--
    }
    repeat(if (x % 2 == 0) a - 1 else a) {
        res.addFirst(0)
    }
    repeat(b) {
        res.addLast(1)
    }
    if (x % 2 == 0) {
        if (a != 0) {
            res.addLast(0)
        } else if (b != 0) {
            res.addFirst(1)
        }
    }

    println(res.joinToString(""))
}
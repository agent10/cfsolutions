package r645_div2_B

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        readInt()
        val arr = readIntArray().sorted().reversed()
        var count = arr.size

        arr.forEach {
            if (it - 1 >= count) {
                count--
            }
        }
        println(count + 1)
    }
}
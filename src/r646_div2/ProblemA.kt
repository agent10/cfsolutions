package r646_div2_A

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, x) = readIntArray()
        val arr = readIntArray()

        val oddC = arr.count { it % 2 != 0 }
        val evenC = arr.size - oddC

        var ok = false
        for (i in 1..x step 2) {
            val e = x - i
            if (i <= oddC && e <= evenC) {
                ok = true
                break
            }
        }

        if (ok) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
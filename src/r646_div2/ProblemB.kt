package r646_div2_B

import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val s = readString()
        val oc = s.count {
            it == '0'
        }
        val lc = s.length - oc
        if (oc >= lc) {
            val hl = s[0] == '1' || s[s.lastIndex] == '1'
            println(lc - if (hl) 1 else 0)
        } else {
            val hl = s[0] == '0' || s[s.lastIndex] == '0'
            println(oc - if (hl) 1 else 0)
        }
    }
}
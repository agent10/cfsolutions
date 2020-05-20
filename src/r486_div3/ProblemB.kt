package r486_div3_B

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val ss = mutableListOf<String>()
    repeat(n) {
        ss += readString()
    }

    var broken = false
    ss.sortWith(Comparator { t, t2 ->
        if (t.length > t2.length) {
            if (t.contains(t2)) return@Comparator 1
        }

        if (t.length < t2.length) {
            if (t2.contains(t)) return@Comparator -1
        }

        if (t.contains(t2)) return@Comparator 0

        broken = true
        0
    })
    if (broken) {
        println("NO")
    } else {
        println("YES")
        println(ss.joinToString("\n"))
    }
}
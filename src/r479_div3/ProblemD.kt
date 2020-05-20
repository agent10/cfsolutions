package r479_div3_D

import java.lang.Long.max

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val arr = readLongArray()

    val pairs = mutableListOf<Pair<Long, Long>>()

    arr.forEachIndexed { index1, l1 ->
        arr.forEachIndexed { index2, l2 ->
            if (index1 != index2) {
                if (l1 < l2 && l1 * 2L == l2) {
                    pairs += Pair(l1, l2)
                } else if (l1 > l2 && l2 * 3L == l1) {
                    pairs += Pair(l1, l2)
                }
            }
        }
    }

//    println(pairs)

    for (i1 in pairs.indices) {
        var pair = pairs[i1]
        var found = false
        for (i2 in pairs.indices) {
            if (i2 != i1) {
                val pair2 = pairs[i2]
                if (pair.first == pair2.second) {
                    found = true
                    break
                }
            }
        }

        if (!found) {
            val result = mutableListOf<Long>()
            result += pair.first

            while (true) {
                val nr = pairs.firstOrNull {
                    pair.second == it.first
                }
                if (nr == null) {
                    result += pair.second
                    break
                } else {
                    result += nr.first
                    pair = nr
                }
            }

            println(result.joinToString(" "))

            break
        }
    }
}
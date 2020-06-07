package kotlin_heroes_4_contest_C

import java.lang.Long.max
import kotlin.math.pow

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, k, x, y) = readIntArray()
        val arr = readIntArray()
        val fmin = arr.count { it > k } * x
        if (fmin <= y) {
            println(fmin)
        } else {
            val sortedarr = arr.sorted().reversed().toMutableList()
            var total = 0
            while (true) {
                val arrsum = sortedarr.sum()
                val rem = arrsum % sortedarr.size
                val maxevenly =
                    if (rem == 0) arrsum / sortedarr.size else ((arrsum / sortedarr.size) + 1)
                if (maxevenly <= k) {
                    total += y
                    break
                } else {
                    total += x

                    sortedarr[sortedarr.indexOfFirst {
                        it != 0
                    }] = 0

                    if (sortedarr.count { it > k } == 0) {
                        break
                    }

                }
            }

            println(minOf(fmin, total))
        }
    }
}
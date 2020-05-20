package r486_div3_C

import java.lang.Long.max
import java.util.*

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val k = readInt()

    val lists = mutableListOf<List<Int>>()
    val diffSet = mutableSetOf<Int>()
    for (i in 1..k) {
        readInt()
        val arr = readIntArray()
        val sum = arr.sum()
        val tempList = mutableListOf<Int>()
        val tempSet = mutableSetOf<Int>()
        for (j in arr.indices) {
            val diff = (sum - arr[j])
            if (diffSet.contains(diff)) {
                println("YES")
                println("$i ${j + 1}")
                lists.forEachIndexed { index, list ->
                    val ii = list.indexOf(diff)
                    if (ii != -1) {
                        println("${index + 1} ${ii + 1}")
                    }
                }
                return
            }
            tempList += diff
            tempSet += diff
        }
        lists += tempList
        diffSet.addAll(tempSet)
    }
    println("NO")
}
package r642_div3

import kotlin.math.*

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toLong() }
        val a = readLine()!!.split(" ").map { it.toLong() }.sorted()
        var maxSum = a.sum()
        val b = readLine()!!.split(" ").map { it.toLong() }.sortedDescending()
        repeat(k.toInt()) {
            if (b[it] > a[it]) {
                maxSum += (b[it] - a[it])
            }
        }

        println(maxSum)
    }
}
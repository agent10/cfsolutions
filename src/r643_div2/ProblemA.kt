package r643_div2

import helpers.readInt
import helpers.readString

fun main() {
    val t = readInt()
    repeat(t) {
        val (a1s, ks) = readString().split(" ")
        var a1 = a1s.toLong()

        var k = 0
        while(true) {
            k++
            if(k.toString() == ks) {
                break
            }
            val a1a = a1.toString().map { it.toString() }.map { it.toLong() }
            val min = a1a.min()!!
            val max = a1a.max()!!
            val diff = min * max
            a1 += diff
            if (diff == 0L) {
                break
            }
        }

        println(a1)
    }
}
package r643_div2

import helpers.readInt
import helpers.readIntArray

fun main() {
    val t = readInt()
    repeat(t) {
        readInt()
        var count = 0
        val group = mutableListOf<Int>()
        val inexp = readIntArray().sorted()
        inexp.forEach {
            group += it
            if (group.size == group.max()) {
                group.clear()
                count++
            }
        }
        if (count == 0) {
            count++
        }

        println(count)
    }
}
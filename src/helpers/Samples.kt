package helpers

import java.lang.Long.max

fun main() {
}

fun complexNumberMultiply(a: String, b: String): String {
    val (x1, x2) = a.split("+").map {
        it.removeSuffix("i").toInt()
    }

    val (y1, y2) = b.split("+").map {
        it.removeSuffix("i").toInt()
    }

    val z1 = x1 * y1 - x2 * y2
    val z2 = (x1 * y2 + x2 * y1)

    return "$z1+${z2}i"
}
package kotlin_heroes_4_B


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (a1, b1) = readIntArray()
        val (a2, b2) = readIntArray()

        val max1 = maxOf(a1, b1)
        val max2 = maxOf(a2, b2)
        val min1 = minOf(a1, b1)
        val min2 = minOf(a2, b2)

        if (max1 == max2 && min1 + min2 == max1) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
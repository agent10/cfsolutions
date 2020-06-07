package kotlin_heroes_4_C


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        var n = readInt()
        var d = 10
        val res = mutableListOf<Int>()
        while (true) {
            val r = n % d
            if (r != 0) {
                res += r
            }
            n -= r
            d *= 10
            if (n <= 0) break

        }

        println(res.size)
        println(res.joinToString(" "))
    }
}
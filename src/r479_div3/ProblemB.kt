import java.lang.Long.max


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val s = readString()

    val map = mutableMapOf<String, Int>()
    for (i in 0..s.length - 2) {
        val ss = s.substring(i, i + 2)
        val c = map.getOrDefault(ss, 0)
        map.put(ss, c + 1)
    }
    print(map.maxBy {
        it.value
    }!!.key)
}
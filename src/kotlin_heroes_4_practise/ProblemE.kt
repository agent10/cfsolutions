package kotlin_heroes_4_E


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val n = readInt()
        if (n <= 3) {
            println(-1)
        } else {
            val arr = IntArray(n) {
                n - it
            }

            val res = mutableListOf<Int>()

            val arr1 = arr.filter {
                it % 2 == 0
            }.sorted().toMutableList()
            arr1.remove(4)

            val arr2 = arr.filter {
                it % 2 != 0
            }

            res += arr2
            res += 4
            res += arr1

            println(res.joinToString(" "))
        }
    }
}
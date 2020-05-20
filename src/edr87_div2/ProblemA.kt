package edr87_div2

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        val (a, b, c, d) = readLongArray()
        when {
            b >= a -> println(b)
            c - d <= 0 -> println(-1)
            else -> {
                if (a - b <= c - d) println(b + c)
                else {
                    val sleepstep = c - d

                    val countSteps = (a - b) / (sleepstep)
                    val add = if ((a - b) % (sleepstep) == 0L) 0 else 1
                    println(b + (c * (countSteps + add)))
                }
            }
        }
    }
}
package r481_div3_C

import java.lang.Long.max


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val (n, m) = readIntArray()
    val roomsCount = readLongArray()
    val letterRoomN = readLongArray()

    var f = 1L
    var fr = 1L
    var lr = fr + roomsCount[f.toInt() - 1] - 1
    letterRoomN.forEach { roomN ->
        while (true) {
            if (roomN in fr..lr) {
                println("$f ${roomN - fr + 1}")
                break
            } else {
                f++
                fr = lr + 1L
                lr = fr + roomsCount[f.toInt() - 1] - 1
            }
        }
    }
}
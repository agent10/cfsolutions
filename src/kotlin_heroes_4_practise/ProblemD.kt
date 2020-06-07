package kotlin_heroes_4_D


fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }

fun main() {
    val t = readInt()
    repeat(t) {
        readInt()
        val arr = readIntArray()

        var li = -1
        var ri = arr.lastIndex + 1

        var mn = 0

        var a = 0
        var al = 0

        var b = 0
        var bl = 0

        while (true) {
            mn++

            al = 0
            while (al <= bl && li + 1 < ri) {
                li++
//                println("alice eat = ${arr[li]}")
                al += arr[li]
            }
            a += al
            if (li + 1 >= ri) break

            mn++
            bl = 0
            while (bl <= al && ri - 1 > li) {
                ri--
//                println("bob eat = ${arr[ri]}")
                bl += arr[ri]
            }
            b += bl
            if (ri - 1 <= li) break
        }

        println("$mn $a $b")
    }
}
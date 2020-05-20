package edr87_div2_b

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

private fun readIntArray() = readString().split(" ").map { it.toInt() }
private fun readLongArray() = readString().split(" ").map { it.toLong() }

class Holder {
    val set = HashSet<Char>()
    var len = 0
    var blocked = false

    fun add(c: Char): Int {
        if (!blocked) {
            if (!check()) {
                set.add(c)

                len++
                if (check()) {
                    blocked = true
                }
            } else {
                blocked = true
            }
        }
        return len
    }

    fun check() = set.size == 3
}

fun main() {
    repeat(readInt()) {
        var minHolder: Holder? = null
        var holder: Holder? = null
        val s = readString()
        for (i in 1 until s.length) {
            holder?.add(s[i])

            if (holder?.blocked == true) {
                if (minHolder == null || holder.len < minHolder.len) {
                    minHolder = holder
                }

                if (minHolder.blocked && minHolder.len == 3) {
                    break
                }
            }

            if (s[i] != s[i - 1]) {
                holder = Holder().apply {
                    add(s[i - 1])
                    add(s[i])
                }
            }
        }

        println(minHolder?.len ?: 0)
    }
}
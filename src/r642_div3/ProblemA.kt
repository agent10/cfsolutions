package r642_div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, m) = readLine()!!.split(" ").map { it.toLong() }
        when (n) {
            1L -> {
                println("0")
            }
            2L -> {
                println(m)
            }
            else -> {
                println(m * 2)
            }
        }
    }
}
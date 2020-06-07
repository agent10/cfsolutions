package r490_div3_D

import java.lang.Long.max
import kotlin.system.measureTimeMillis

fun readString() = readLine()!!

fun readInt() = readString().toInt()
fun readLong() = readString().toLong()

fun readIntArray() = readString().split(" ").map { it.toInt() }
fun readLongArray() = readString().split(" ").map { it.toLong() }


fun isaccess(vu: MutableMap<Int, Int>, map: MutableMap<Int, Boolean>, s: Int, u: Int, init: Int = u) {
    if (vu[u] != null && vu[u] != s && vu[u] != init) {
        isaccess(vu, map, s, vu[u]!!, init)
        if (map[vu[u]!!] == true) {
            if (u != s) {
                map.putIfAbsent(u, true)
            }
        }
    } else {
        if (vu[u] == s) {
            if (u != s) {
                map.putIfAbsent(u, true)
            }
        }
    }
}

fun main() {
    val (n, m, s) = readIntArray()

    val uv = mutableMapOf<Int, Int>()
    val vu = mutableMapOf<Int, Int>()
    val map = mutableMapOf<Int, Boolean>()

    repeat(m) {
        val (u, v) = readIntArray()
        uv.putIfAbsent(u, v)
        vu.putIfAbsent(v, u)
        if (u == s) {
            map.putIfAbsent(v, true)
        }
    }

//
//    println(map)
//
//    for (i in 1..n) {
//        isaccess(vu, map, s, i)
//    }
//
//    println(map)
//

    val rr = mutableListOf<Int>()
    for (i in 1..n) {
        if (map[i] != true) {
            val uvC = mutableMapOf<Int, Int>()
            uvC.putAll(uv)

            val mapC = mutableMapOf<Int, Boolean>()
            mapC.putAll(map)

            uvC.putIfAbsent(i, s)
            mapC.putIfAbsent(i, true)
            for (ii in 1..n) {
                if (map[ii] != true) {
                    isaccess(vu, map, s, ii)
                }
            }
            rr
        }
    }


}
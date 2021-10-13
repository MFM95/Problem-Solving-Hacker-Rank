import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val arr = LongArray(n+1)
    for (i in 0..n)
        arr[i] = 0

    // Difference Array
    for (i in queries.indices) {
        val a = queries[i][0] - 1
        val b = queries[i][1] - 1
        val k = queries[i][2]
        arr[a] += k.toLong()
        arr[b+1] -= k.toLong()
    }

    // Prefix Sum
    for (i in 1 until arr.size) {
        arr[i] += arr[i-1]
    }

    return arr.max()?: 0
}


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
 

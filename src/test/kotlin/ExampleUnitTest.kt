package com.example.problemsolving

import org.junit.Test

class ExampleUnitTest {
    @Test
    fun solve_problem() {
        println(triplets(arrayOf(1, 3, 5, 7), arrayOf(5, 7, 9), arrayOf(7, 9, 11, 13)))
        println(triplets(arrayOf(1, 4, 5), arrayOf(2, 3, 3), arrayOf(1, 2, 3)))
        println(triplets(arrayOf(1, 3, 5), arrayOf(2, 3), arrayOf(1, 2, 3)))
    }

    fun triplets(a: Array<Int>, b: Array<Int>, c: Array<Int>): Long {
        var count = 0L
        val A = a.distinct().sorted()
        val B = b.distinct().sorted()
        val C = c.distinct().sorted()
        for (it in B) {
            count += (binarySearchNearestIndex(A, it) * binarySearchNearestIndex(C, it)).toLong()
        }
        return count
    }


    private fun binarySearchNearestIndex(arr: List<Int>, x: Int): Int {
        var index = -1
        var start = 0
        var end = arr.size - 1
        var mid: Int
        while (start <= end) {
            mid = (start + end) / 2
            if (arr[mid] <= x) {
                index = mid
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return index + 1
    }


    private fun countLessThanMe(a: Array<Int>): Map<Int, Int> {
        val m = HashMap<Int, Int>()
        val map = HashMap<Int, Int>()
        for (it in a) {
            if (m.containsKey(it)) m[it] = m[it]!! + 1
            else m[it] = 1
        }

        for (i in 0..findMax(a)) {
            if (m.containsKey(i)) {
                map[i] = m[i]!! + (map[i - 1] ?: 0)
            } else {
                map[i] = (map[i - 1] ?: 0)
            }
        }

        return map
    }

    private fun findMax(a: Array<Int>): Int {
        if (a.isNullOrEmpty()) return -1
        var max = a[0]
        for (it in a) {
            if (it > max)
                max = it
        }
        return max
    }
}


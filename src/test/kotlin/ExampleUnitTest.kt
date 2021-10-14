package com.example.problemsolving

import org.junit.Test

class ExampleUnitTest {
    @Test
    fun solve_problem() {
        println(
            minimumBribes(arrayOf(2,5,1,3,4))
        )
    }

    fun minimumBribes(q: Array<Int>): Unit {
        var bribes = 0
        for (i in (q.size - 1) downTo 0) {
            if (q[i] != i + 1) {
                when {
                    q[i - 1] == i + 1 -> {
                        swap(q, i - 1, i)
                        bribes++
                    }
                    q[i - 2] == i + 1 -> {
                        swap(q, i - 2, i - 1)
                        swap(q, i - 1, i)
                        bribes += 2
                    }
                    else -> {
                        println("Too chaotic")
                        return
                    }
                }
            }
        }
        println(bribes.toString())
    }

    fun swap(q: Array<Int>, i: Int, j: Int) {
        val temp = q[i]
        q[i] = q[j]
        q[j] = temp
    }

}


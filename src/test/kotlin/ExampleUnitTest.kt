package com.example.problemsolving

import org.junit.Test

class ExampleUnitTest {
    @Test
    fun solve_problem() {
        println(
            rotLeft(arrayOf(1,2,3,4,5), 4).joinToString(",")
        )
    }

    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
        var i = d
        var count = 0
        val arr = ArrayList<Int>()
        while (count < a.size) {
            if (i >= a.size) {
                i = 0
            } else {
                arr.add(a[i++])
                count++
            }
        }
        return arr.toTypedArray()
    }



}


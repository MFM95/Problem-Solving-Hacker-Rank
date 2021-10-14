package com.example.problemsolving

import org.junit.Test

class ExampleUnitTest {
    @Test
    fun solve_problem() {
        println(
            hourglassSum(
                arrayOf(
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 1, 0, 0, 0, 0),
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 0, 2, 4, 4, 0),
                    arrayOf(0, 0, 0, 2, 0, 0),
                    arrayOf(0, 0, 1, 2, 4, 0)
                )
            )
        )
    }

    fun hourglassSum(arr: Array<Array<Int>>): Int {
        var maxSum = Int.MIN_VALUE
        for (i in 1..4) {
            for (j in 1..4) {
                val sum = arr[i][j] +
                        arr[i - 1][j - 1] +
                        arr[i - 1][j] +
                        arr[i - 1][j + 1] +
                        arr[i + 1][j - 1] +
                        arr[i + 1][j] +
                        arr[i + 1][j + 1]
                if (sum > maxSum) maxSum = sum
            }
        }
        return maxSum
    }


}


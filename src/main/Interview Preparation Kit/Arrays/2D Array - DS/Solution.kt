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

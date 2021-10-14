
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

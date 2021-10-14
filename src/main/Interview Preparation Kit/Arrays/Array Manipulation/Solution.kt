

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

    return arr.max() ?: 0
}

fun triplets(a: Array<Int>, b: Array<Int>, c: Array<Int>): Long {
    var count = 0L
    val A = a.distinct().sorted()
    val B = b.distinct().sorted()
    val C = c.distinct().sorted()
    for (it in B) {
        count +=
            (binarySearchNearestIndex(A, it).toLong() *
                    binarySearchNearestIndex(C, it).toLong())
                .toLong()
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
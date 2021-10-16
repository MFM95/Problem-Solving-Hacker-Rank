
// First Solution
fun minimumSwaps(arr: Array<Int>): Int {
    val map  = HashMap<Int, Int>()
    for (i in arr.indices) {
        map[arr[i]] = i
    }
    var swaps = 0
    for (i in arr.indices) {
        val currentValue = arr[i]
        if (currentValue != i+1) {
            map[i+1]?.let {
                swap(arr, i, it)
                swaps ++
                map[currentValue] = it
                map[arr[i]] = i
            }
        }
    }
    return swaps
}

private fun swap(arr: Array<Int>, x: Int, y: Int) {
    val temp = arr[x]
    arr[x] = arr[y]
    arr[y] = temp
}


// Another Solution

fun minimumSwaps_AnotherSolution(arr: Array<Int>): Int {
    var swapsCount = 0
    for (i in arr.indices) {
        while (arr[i] != i+1) {
            val temp = arr[i]
            arr[i] = arr[temp - 1]
            arr[temp - 1] = temp
            swapsCount++
        }
    }
    return swapsCount
}
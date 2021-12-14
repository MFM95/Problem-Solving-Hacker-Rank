fun countSwaps(a: Array<Int>): Unit {
    var swaps = 0
    for (i in a.indices) {
        for (j in 0 until a.size - 1) {
            if (a[j] > a[j + 1]) {
                var temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
                swaps++
            }
        }
    }

    println("Array is sorted in $swaps swaps.")
    println("First Element: ${a[0]} ")
    println("Last Element: ${a[a.size - 1]} ")
}

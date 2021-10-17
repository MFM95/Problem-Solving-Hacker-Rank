fun pairs(k: Int, arr: Array<Int>): Int {
    var count = 0
    val map = HashMap<Int, Boolean>()
    for (item in arr) {
        map[item] = true
    }
    for (item in arr) {
        if (map.contains((k + item)))
            count ++
    }

    return count
}
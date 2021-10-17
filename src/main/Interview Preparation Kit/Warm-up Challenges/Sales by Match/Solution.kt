fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val map = HashMap<Int, Int>()
    for (number in ar) {
        if (map.containsKey(number))
            map[number] = map[number]!! + 1
        else map[number] = 1
    }

    var count = 0
    map.forEach {
        count += it.value / 2
    }

    return count

}
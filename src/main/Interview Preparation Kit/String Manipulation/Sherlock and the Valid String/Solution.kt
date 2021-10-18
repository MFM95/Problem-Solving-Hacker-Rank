fun isValid(s: String): String {
    val charsMap = HashMap<Char, Int>()
    s.forEach {
        if (charsMap.containsKey(it)) charsMap[it] = charsMap[it]!! + 1
        else charsMap[it] = 1
    }
    charsMap.values.distinct().size.let {
        if (it == 1) return "YES"
        if (it > 2) return "NO"
    }
    val numbersMap = HashMap<Int, Int>()
    charsMap.values.toList().forEach {
        if (numbersMap.containsKey(it)) numbersMap[it] = numbersMap[it]!! + 1
        else numbersMap[it] = 1
    }
    val keys = numbersMap.keys.toList()
    val values = numbersMap.values.toList()
    if (values[0] == 1) {
        if (keys[0] == 1 || keys[0] - keys[1] == 1)
            return "YES"
    } else if (values[1] == 1) {
        if (keys[1] == 1 || keys[1] - keys[0] == 1)
            return "YES"
    } else {
        return "NO"
    }
    return "NO"
}

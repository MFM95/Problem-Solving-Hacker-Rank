fun twoStrings(s1: String, s2: String): String {
    val map = HashMap<Char, Int>()
    s1.forEach {
        if (!map.containsKey(it)) map[it] = 1
    }
    s2.forEach {
        if (map.containsKey(it)) return "YES"
    }
    return "NO"
}
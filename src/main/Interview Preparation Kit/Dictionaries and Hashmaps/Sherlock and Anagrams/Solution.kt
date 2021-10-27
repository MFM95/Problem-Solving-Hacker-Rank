
fun sherlockAndAnagrams(s: String): Int {
    val list = ArrayList<String>()
    var count = 0
    val map = HashMap<String, Int>()
    for (i in s.indices) {
        val subStr = StringBuilder("")
        subStr.append(s[i])
        list.add(subStr.toString())
        for (j in (i+1) until s.length) {
            subStr.append(s[j])
            list.add(subStr.toString())
        }
    }


    for (i in 0 until list.size) {
        val sub = list[i].toCharArray().sorted().joinToString("")
        if (map.containsKey(sub)) {
            map[sub] = map[sub]!! + 1
        } else {
            map[sub] = 1
        }
    }

    map.forEach {
        if (it.value > 1) {
            count += (it.value * (it.value - 1) / 2)
        }
    }

    return count
}

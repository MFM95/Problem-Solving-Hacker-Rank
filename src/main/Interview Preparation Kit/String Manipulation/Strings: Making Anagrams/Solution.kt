fun makeAnagram(a: String, b: String): Int {
    val mapA = HashMap<Char, Int>()
    val mapB = HashMap<Char, Int>()
    for (i in a.indices) {
        if (mapA.containsKey(a[i]))
            mapA[a[i]] = mapA[a[i]]!! + 1
        else
            mapA[a[i]] = 1
    }
    for (i in b.indices) {
        if (mapB.containsKey(b[i]))
            mapB[b[i]] = mapB[b[i]]!! + 1
        else
            mapB[b[i]] = 1
    }
    var count = 0
    for (i in a.indices) {
        if (!mapB.containsKey(a[i]) || mapB[a[i]]!! <= 0) {
            count++
        } else {
            mapB[a[i]] = mapB[a[i]]!! - 1
        }
    }
    for (i in b.indices) {
        if (!mapA.containsKey(b[i]) || mapA[b[i]]!! <= 0) {
            count++
        } else {
            mapA[b[i]] = mapA[b[i]]!! - 1
        }
    }

    return count
}

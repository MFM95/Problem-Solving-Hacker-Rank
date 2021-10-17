fun repeatedString(s: String, n: Long): Long {
    var occ = 0
    for (ch in s) {
        if (ch == 'a') occ ++
    }

    var count = (n / s.length) * occ
    val remainLen = (n % s.length).toInt()
    for (i in 0 until remainLen) {
        if (s[i] == 'a') count++
    }

    return count
}
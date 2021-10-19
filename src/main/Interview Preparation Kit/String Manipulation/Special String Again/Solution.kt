fun substrCount(n: Int, s: String): Long {
    var result = 0L
    var count = 1
    var current = s[0]
    for (i in 1 until n) {
        if (s[i] == current) {
            count++
        } else {
            result += (count * (count + 1)) / 2
            current = s[i]
            count = 1
        }
    }
    result += (count * (count + 1)) / 2

    for (i in 1 until n) {
        var x = i - 1;
        var y = i + 1
        if (x >= 0 && y < n && s[x] == s[y] && s[i] != s[x]) {
            current = s[x]
            result++
            x--
            y++
            while (x >= 0 && y < n && s[x] == s[y] && s[x] == current) {
                result++
                x--
                y++
            }
        }
    }

    return result
}

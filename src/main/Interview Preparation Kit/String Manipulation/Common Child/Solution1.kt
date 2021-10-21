
fun commonChild(s1: String, s2: String): Int {
    val table = Array(s1.length+1) { Array(s2.length+1) { -1 } }
    return lcs(s1, s2, s1.length, s2.length, table)
}

fun lcs(x: String, y: String, n: Int, m: Int, table: Array<Array<Int>>): Int {
    if (n == 0 || m == 0) return 0
    if (table[n][m] == -1) {
        if (x[n - 1] == y[m - 1]) {
            table[n][m] = 1 + lcs(x, y, n - 1, m - 1, table)
        } else {
            table[n][m] = lcs(x, y, n - 1, m, table).coerceAtLeast(lcs(x, y, n, m - 1, table))
        }
    }
    return table[n][m]
}


fun commonChild(s1: String, s2: String): Int {
    val table = Array(s1.length+1) { Array(s2.length+1) { 0 } }
    return lcs(s1, s2, s1.length, s2.length, table)
}

fun lcs(x: String, y: String, n: Int, m: Int, table: Array<Array<Int>>): Int {
    for (i in 1..n) {
        for (j in 1..m) {
            if (x[i-1] == y[j-1]) {
                table[i][j] = 1 + table[i-1][j-1]
            } else {
                table[i][j] = Math.max(table[i-1][j], table[i][j-1])
            }
        }
    }
    return table[n][m]
}

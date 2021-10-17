fun alternatingCharacters(s: String): Int {
    var deletionCount = 0
    var lastChar = ' '
    s.forEach {
        if (it == lastChar)
            deletionCount ++
        else lastChar = it
    }
    return deletionCount
}

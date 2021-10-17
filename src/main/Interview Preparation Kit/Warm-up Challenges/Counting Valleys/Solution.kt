fun countingValleys(steps: Int, path: String): Int {
    var level = 0
    var valleys = 0
    var inAValley = false
    path.forEach {
        if (it == 'U') level ++
        else if (it == 'D') level --

        if (level == 0) inAValley = false
        if (!inAValley && level < 0) {
            valleys ++
            inAValley = true
        }
    }

    return valleys
}
fun jumpingOnClouds(c: Array<Int>): Int {
    var index = 0
    var jumps = 0
    while(index < c.size) {
        if (index + 2 < c.size && c[index + 2] == 0) {
            index += 2
            jumps ++
        } else if (index + 1 < c.size && c[index + 1] == 0){
            index += 1
            jumps ++
        } else {
            break
        }
    }

    return jumps
}
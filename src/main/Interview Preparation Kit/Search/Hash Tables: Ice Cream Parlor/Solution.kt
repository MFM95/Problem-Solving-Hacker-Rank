fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    val map = HashMap<Int, Int>()
    for (i in cost.indices) {
        if (map.containsKey(money - cost[i])) {
            println("${map[money - cost[i]]} ${i + 1} ")
            return
        } else {
            map[cost[i]] = i + 1
        }
    }
    println("${cost.indexOf(money / 2)} ${cost.lastIndexOf(money / 2)}")
}

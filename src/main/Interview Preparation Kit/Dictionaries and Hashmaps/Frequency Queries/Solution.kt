fun freqQuery(queries: Array<Array<Int>>): Array<Int> {
    val numMap = HashMap<Int, Int>()
    val freqMap = HashMap<Int, Int>()
    val result = ArrayList<Int>()
    queries.forEach {
        val action = it[0]
        val v = it[1]
        if (action == 1) {
            if (numMap.containsKey(v) && numMap[v]!! > 0) {
                val oldValue = numMap[v] ?: 0
                val newValue = (numMap[v] ?: 0) + 1
                numMap[v] = newValue
                if (freqMap.containsKey(oldValue)) {
                    freqMap[oldValue] = freqMap[oldValue]!! - 1
                }
                if (freqMap.containsKey(newValue)) {
                    freqMap[newValue] = freqMap[newValue]!! + 1
                } else {
                    freqMap[newValue] = 1
                }
            } else {
                numMap[v] = 1
                if (freqMap.containsKey(1)) {
                    freqMap[1] = freqMap[1]!! + 1
                } else {
                    freqMap[1] = 1
                }
            }
        } else if (action == 2) {
            if (numMap.containsKey(v) && numMap[v]!! > 0) {
                val oldValue = numMap[v] ?: 0
                val newValue = (numMap[v] ?: 1) - 1
                numMap[v] = newValue
                if (freqMap.containsKey(oldValue)) {
                    freqMap[oldValue] = freqMap[oldValue]!! - 1
                }
                if (freqMap.containsKey(newValue)) {
                    freqMap[newValue] = freqMap[newValue]!! + 1
                } else {
                    freqMap[numMap[v]!!] = 1
                }
            }
        } else if (action == 3) {
            if (freqMap.containsKey(v) && freqMap[v]!! > 0) {
                result.add(1)
            } else {
                result.add(0)
            }
        }
    }
    return result.toTypedArray()
}

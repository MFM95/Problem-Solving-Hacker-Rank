fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val hashMap = HashMap<String, Int>()
    magazine.forEach {
        if (hashMap[it] != null && hashMap.containsKey(it)) {
            hashMap[it] = hashMap[it]!! + 1
        } else {
            hashMap[it] = 1
        }
    }

    note.forEach {
        if (hashMap[it] != null && hashMap.containsKey(it) && hashMap[it]!! > 0) {
            hashMap[it] = hashMap[it]!! - 1
        } else {
            println("No")
            return
        }
    }
    println("Yes")

}
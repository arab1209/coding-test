class `튜플` {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()

        val result = s.removePrefix("{{").removeSuffix("}}").split("},{").map { it.split(",").map(String::toInt) }

        val tuple = mutableListOf<Int>()
        result.sortedBy { it.size }.forEach { list ->
            list.forEach { num ->
                if (!tuple.contains(num)) {
                    tuple.add(num)
                }
            }
        }
        return tuple.toIntArray()
    }
}
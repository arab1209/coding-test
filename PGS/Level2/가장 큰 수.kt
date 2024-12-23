class `가장 큰 수` {
    fun solution(numbers: IntArray): String {
        return numbers.map { it.toString() }.sortedWith { a, b -> (b + a).compareTo(a + b) }.joinToString("")
            .let { if (it.startsWith("0")) "0" else it }
    }
}
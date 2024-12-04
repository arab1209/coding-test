class `자리 수 더하기` {
    fun solution(n: Int): Int {
        var answer: Int = 0
        return n.toString().map { it.digitToInt() }.sum()
    }
}
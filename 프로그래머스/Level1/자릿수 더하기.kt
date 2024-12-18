class `자릿수 더하기` {
    fun solution(n: Int): Int {
        return n.toString().map { it.toString().toInt() }.sum()
    }
}
class `하샤드 수` {
    fun solution(x: Int): Boolean {
        return x % x.toString().sumOf { it - '0' } == 0
    }
}
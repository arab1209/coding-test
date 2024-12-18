class `최댓값과 최솟값` {
    fun solution(s: String): String {
        var answer = ""

        return s.split(" ").map { it.toInt() }.let { "${it.minOrNull()} ${it.maxOrNull()}" }
    }
}
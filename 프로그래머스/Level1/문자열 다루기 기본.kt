class `문자열 다루기 기본` {
    fun solution(s: String): Boolean {
        return when (s.length) {
            4, 6 -> s.all { it.isDigit() }
            else -> false
        }
    }
}
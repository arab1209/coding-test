class `JadenCase 문자열 만들기` {
    fun solution(s: String): String {
        var answer = ""

        return s.split(" ").map {
            if (it.isNotEmpty()) {
                it.let { it[0].uppercase() + it.substring(1).lowercase() }
            } else it
        }.joinToString(" ")
    }
}
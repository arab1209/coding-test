class `특정 문자 제거하기` {
    fun solution(my_string: String, letter: String): String {
        return my_string.filter { it.toString() != letter }
    }
}
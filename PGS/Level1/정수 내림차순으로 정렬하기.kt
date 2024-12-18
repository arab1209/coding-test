class `정수 내림차순으로 정렬하기` {
    fun solution(n: Long): Long {
        return n.toString().map { it.toString().toInt() }.sortedDescending().joinToString("").toLong()
    }
}
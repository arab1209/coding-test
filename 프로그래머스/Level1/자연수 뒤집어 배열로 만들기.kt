class `자연수 뒤집어 배열로 만들기` {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }
}
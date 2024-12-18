class `배열의 유사도` {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        return s1.intersect(s2.toSet()).size
    }
}
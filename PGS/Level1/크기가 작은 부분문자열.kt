class `크기가 작은 부분문자열` {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        return (0..t.length - p.length).filter {
            t.substring(it, it + p.length) <= p
        }.count()
    }
}
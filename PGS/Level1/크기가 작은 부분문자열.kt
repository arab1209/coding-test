class `크기가 작은 부분문자열` {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        for (i in 0..t.length - p.length) {
            if (t.substring(i, i + p.length) <= p) {
                answer++
            }
        }

        return answer
    }
}
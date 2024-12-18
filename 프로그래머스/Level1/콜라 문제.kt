class `콜라 문제` {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0

        var emptyBottle: Int = n

        while(emptyBottle >= a) {
            answer += (emptyBottle / a) * b
            emptyBottle = (emptyBottle / a) * b + emptyBottle % a
        }
        return answer
    }
}
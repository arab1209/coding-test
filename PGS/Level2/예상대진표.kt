class `예상 대진표` {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0

        var firstPlayer = a
        var secondPlayer = b

        while(firstPlayer != secondPlayer) {
            firstPlayer = (firstPlayer+1) / 2
            secondPlayer = (secondPlayer+1) / 2

            answer++
        }

        return answer
    }
}
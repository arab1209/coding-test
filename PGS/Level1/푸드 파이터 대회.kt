class `푸드 파이터 대회` {
    fun solution(food: IntArray): String {
        var answer: String = ""
        food.mapIndexed { i, k -> i to k }.map {
            answer += it.first.toString().repeat(if (it.second % 2 == 1) (it.second - 1) / 2 else it.second / 2)
        }
        return answer + "0" + answer.reversed()
    }
}
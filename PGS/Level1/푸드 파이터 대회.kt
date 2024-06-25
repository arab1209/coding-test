class `푸드 파이터 대회` {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var count: String = "0"

        for (i in food) {
            for (j in 0 until i / 2) {
                answer += count
            }
            count = (count.toInt() + 1).toString()
        }

        return answer + "0" + StringBuilder(answer).reverse().toString()
    }
}
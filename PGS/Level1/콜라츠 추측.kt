class `콜라츠 추측` {
    fun solution(num: Int): Int {
        var answer = 0
        var result = num.toLong()

        while (result != 1L) {
            if (answer == 500) {
                return -1
            } else {
                answer++
                if (result % 2 == 0L) {
                    result /= 2
                } else {
                    result = result * 3 + 1
                }
            }
        }
        return answer
    }
}
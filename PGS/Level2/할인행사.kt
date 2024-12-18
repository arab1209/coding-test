class `할인행사` {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0

        for (i in 0..discount.size - 10) {
            var arr = discount.slice(i until i + 10)

            var flag = true
            for (j in want.indices) {
                var count = arr.count { it == want[j] }
                if (count < number[j]) {
                    flag = false
                    break
                }
            }
            if (flag) answer++
        }
        return answer
    }
}
class `나누어 떨어지는 숫자 배열` {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        answer = arr.filter { it % divisor == 0}.sorted().toIntArray()

        if(answer.isEmpty()) {
            answer += -1
        }

        return answer
    }
}
class `모의고사` {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        var first = calcResultNumber(answers, listOf(1, 2, 3, 4, 5))
        var second = calcResultNumber(answers, listOf(2, 1, 2, 3, 2, 4, 2, 5))
        var third = calcResultNumber(answers, listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))

        var maxNumber = maxOf(first, second, third)

        if (maxNumber == first) answer += 1
        if (maxNumber == second) answer += 2
        if (maxNumber == third) answer += 3

        return answer
    }

    fun calcResultNumber(answers: IntArray, pattern: List<Int>): Int {
        return answers.indices.count { index ->
            answers[index] == pattern[index % pattern.size]
        }
    }
}
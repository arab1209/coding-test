class `성격 유형 검사하기` {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val temp: MutableMap<String, Int> = mutableMapOf(
            "R" to 0, "T" to 0, "C" to 0, "F" to 0, "J" to 0, "M" to 0, "A" to 0, "N" to 0
        )

        survey.mapIndexed { i, k ->
            if (choices[i] > 4) {
                temp[k[1].toString()] = (temp[k[1].toString()] ?: 0) + (choices[i] - 4)
            } else {
                temp[k[0].toString()] = (temp[k[0].toString()] ?: 0) + (4 - choices[i])
            }
        }

        temp.entries.chunked(2).forEach { pair ->
            if (pair[0].value == pair[1].value) {
                answer += pair[0].key
            } else {
                answer += pair.maxByOrNull { it.value }!!.key
            }
        }

        return answer
    }
}
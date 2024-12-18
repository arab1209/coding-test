class `두개 뽑아서 더하기` {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()

        numbers.forEachIndexed { i, flag ->
            for(j in i+1 until numbers.size) {
                answer.add(flag + numbers[j])
            }
        }

        return answer.sorted().toIntArray()
    }
}
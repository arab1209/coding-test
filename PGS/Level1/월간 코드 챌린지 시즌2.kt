class `월간 코드 챌린지 시즌2` {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        signs.forEachIndexed { i, sign ->
            if (!sign) {
                absolutes[i] = -absolutes[i]
            }
            answer += absolutes[i]
        }
        return answer
    }
}
class `최소 직사각형` {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = sizes.map { it.maxOrNull()!! }.maxOrNull()!! *
                sizes.map { it.minOrNull()!! }.maxOrNull()!!

        return answer
    }
}
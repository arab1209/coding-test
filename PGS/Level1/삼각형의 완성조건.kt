class `삼각형의 완성조건` {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0

        sides.sort()

        return if (sides[0] + sides[1] > sides[2]) 1 else 2
    }
}
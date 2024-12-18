class `카펫` {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()

        return (1..brown + yellow).filter { (brown + yellow) % it == 0 && (it - 2) * (((brown + yellow) / it) - 2) == yellow }
            .reversed().let {
                if (it.size == 1) it + it else it
            }.toIntArray()
    }
}
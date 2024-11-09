class `제일 작은 수 제거하기` {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) return intArrayOf(-1)

        return arr.filter { it != arr.minOrNull() }.toIntArray()
    }
}
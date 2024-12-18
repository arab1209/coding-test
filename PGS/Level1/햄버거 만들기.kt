class `햄버거 만들기` {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0

        var list = ingredient.toMutableList()
        var idx = 0

        while (idx + 3 < list.size) {
            if (list[idx] == 1 && list[idx + 1] == 2 && list[idx + 2] == 3 && list[idx + 3] == 1) {
                answer++
                list.subList(idx, idx + 4).clear()
                idx = maxOf(0, idx - 2)
            } else idx++
        }
        return answer
    }
}
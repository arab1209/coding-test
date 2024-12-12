class `연속 부분 수열의 합` {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        var Elements = mutableListOf<Int>()
        var temp = mutableSetOf<Int>()

        for (i in 0..1) {
            elements.forEach {
                Elements.add(it)
            }
        }

        for (i in 1..elements.size) {
            for (j in 0..elements.size) {
                var sum = 0
                for (k in i until i + j) {
                    sum += Elements[k]
                }
                temp.add(sum)
            }
        }

        return temp.size - 1
    }
}
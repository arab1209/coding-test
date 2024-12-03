class `기능개발` {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()

        var temp = progresses.mapIndexed { i, k ->
            if ((100 - k) % speeds[i] == 0) (100 - k) / speeds[i] else (100 - k) / speeds[i] + 1
        }

        var flag = temp[0]
        var count = 1
        val result = mutableListOf<Int>()

        for (i in 1 until temp.size) {
            if (temp[i] <= flag) {
                count++
            } else {
                result.add(count)
                count = 1
                flag = temp[i]
            }
        }

        result.add(count)

        return result.toIntArray()
    }
}
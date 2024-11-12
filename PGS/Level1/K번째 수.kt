class `K번째 수` {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        commands.forEach {
            val temp = it.joinToString().split(", ").map { it.toInt() }
            val start = temp[0] - 1
            val end = temp[1]
            val resultList = array.slice(start until end).sorted()

            answer += resultList[temp.last()-1]
        }
        return answer
    }
}
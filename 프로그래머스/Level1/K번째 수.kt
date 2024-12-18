class `K번째 수` {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        return commands.map { array.slice(it[0]-1..it[1]-1).sorted()[it.last()-1] }.toIntArray()
    }
}
class `실패율` {
    fun solution(N: Int, stages: IntArray): DoubleArray {
        var answer = doubleArrayOf()

        val rates: MutableList<Pair<Int, Double>> = mutableListOf()
        var c = 0
        var t = 0

        for (i in 1..N) {
            t = stages.filter { i <= it }.count()
            c = stages.filter { i == it }.count()

            if (c != 0) {
                rates.add(i to c.toDouble() / t.toDouble())
            } else {
                rates.add(i to 0.0)
            }
        }

        return rates.sortedWith(compareByDescending { it.second }).map { it.first.toDouble() }.toDoubleArray()
    }
}
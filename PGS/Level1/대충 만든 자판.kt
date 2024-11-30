class `대충 만든 자판` {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        return targets.map { s ->
            s.map { c ->
                keymap.map { k ->
                    k.indexOf(c) + 1
                }.filterNot { it < 1 }.minOrNull()
            }.let {
                if (it.contains(null)) -1 else it.filterNotNull().sum()
            }
        }.toIntArray()
    }
}
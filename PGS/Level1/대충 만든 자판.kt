class `대충 만든 자판` {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val temp = mutableListOf<Int>()
        var check: Boolean = false
        var min = 0

        targets.forEach { i ->
            i.forEach { j ->
                keymap.forEach { k ->
                    if (k.contains(j)) temp.add(k.indexOf(j) + 1)
                }

                var q = temp.minOrNull()

                if (q != null) {
                    min += q
                } else {
                    min = -1
                    check = true
                }
                temp.clear()
            }
            if (check) answer += -1 else answer += min
            check = false
            min = 0
        }
        return answer
    }
}
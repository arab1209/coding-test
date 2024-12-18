class `숫자 짝꿍` {
    fun solution(X: String, Y: String): String {
        var answer: String = ""

        val x = X.groupingBy { it }.eachCount()
        val y = Y.groupingBy { it }.eachCount()

        val common = mutableListOf<Char>()

        for (char in x.keys) {
            if(y.containsKey(char)) {
                repeat(minOf(x[char]!!, y[char]!!)) {
                    common.add(char)
                }
            }
        }

        if (common.isEmpty()) return "-1"
        common.sortDescending()
        if (common.all { it == '0' }) return "0"

        return common.joinToString("")
    }

    /*
    ** 첫번 째 시도에서 10~15 오류나옴 시간초과 이중 반복이 문제였던걸로 판별 후 구조변경
    * fun solution(X: String, Y: String): String {
        var answer: String = ""
        var x = X.toMutableList()

        return Y.mapNotNull { y ->
            x.firstOrNull { z ->
                z == y
            }?.also {
                x.remove(it)
            }
        }.sortedDescending().let{ z ->
            if (z.isEmpty()) {
                "-1"
            } else if (z.all { it == '0' }) {
              "0"
            } else {
               z.joinToString("")
            }
        }
    }
    */
}
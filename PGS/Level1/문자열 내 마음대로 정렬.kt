class `문자열 내 마음대로 정렬` {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        return strings.sortedWith(
            compareBy({ it[n].toInt() }, { it })
        ).toTypedArray()
    }
}
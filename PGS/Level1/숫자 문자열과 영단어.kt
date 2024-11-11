class `숫자 문자열과 영단어` {
    fun solution(s: String): Int {
        var answer: Int = 0
        var string = s
        var word = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        for (i in 0 until word.size) {
            string = string.replace(word[i], i.toString())
        }
        return string.toInt()
    }
}
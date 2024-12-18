class `둘만의 암호` {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""

        s.forEach { char ->
            var nowChar = char
            var step = index

            while (step > 0) {
                nowChar++
                if (nowChar > 'z') {
                    nowChar = 'a'
                }
                if (!skip.contains(nowChar)) {
                    step--
                }
            }

            answer += nowChar
        }

        return answer
    }
}
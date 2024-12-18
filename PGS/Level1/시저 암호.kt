class `시저 암호` {
    fun solution(s: String, n: Int): String {
        var answer = ""

        (s.indices).forEach {
            answer += when (s[it]) {
                ' ' -> ' '
                in 'a'..'z' -> if (s[it] + n > 'z') s[it] + n - 26 else s[it] + n

                in 'A'..'Z' -> if (s[it] + n > 'Z') s[it] + n - 26 else s[it] + n

                else -> s[it] + n
            }
        }
        return answer
    }
}
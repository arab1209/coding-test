class `이상한 문자 만들기` {
    fun solution(s: String): String {
        var answer:String = ""
        s.split(" ").forEachIndexed { q, w ->
            w.forEachIndexed { i, k ->
                if(i % 2 == 0) answer += k.uppercaseChar() else answer += k.lowercaseChar()
            }
            if(q < s.split(" ").size -1) answer += " "
        }
        return answer
    }
}
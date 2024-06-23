class `가운데 글자 가져오기` {
    fun solution(s: String): String {
        var answer = ""
        var strLength = s.length/2

        if(s.length % 2 == 0) {
            answer += s.substring(strLength-1, strLength+1)
        } else {
            answer += s[strLength]
        }
        return answer
    }
}
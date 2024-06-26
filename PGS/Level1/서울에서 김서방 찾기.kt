class `서울에서 김서방 찾기` {
    fun solution(seoul: Array<String>): String {
        var answer = ""

        seoul.forEachIndexed { i, k ->
            if (k == "Kim") answer = "김서방은 ${i}에 있다"
        }

        return answer
    }
}
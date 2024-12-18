class `핸드폰 번호 가리기` {
    fun solution(phone_number: String): String {
        var answer = ""
        var num = phone_number.length - 4


        for (i in 0 until num) {
            answer += "*"
        }

        answer += phone_number.substring(num, phone_number.length)
        return answer
    }
}
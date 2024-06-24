class `부족한 금액 계산하기` {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0

        for(i in 1..count) {
            answer += price*i
        }

        return when(money < answer) {
            true -> answer - money
            false -> 0
        }
    }
}
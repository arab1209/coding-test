class `기사단원의 무기` {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        for (i in 1..number) {
            var cnt: Int = 0;
            for (k in 1..Math.sqrt(i.toDouble()).toInt()) {
                if (i % k == 0) {
                    cnt++
                    if (i / k != k) {
                        cnt++
                    }
                }
            }
            if (limit < cnt) {
                cnt = power
            }
            answer += cnt
            cnt = 0
        }
        return answer
    }
}
class `약수의 개수와 덧셈` {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for(i in left..right) {
            var count = (1..i).filter { i % it == 0 }.count()

            if(count % 2 == 0) answer += i else answer -= i
        }

        return answer
    }
}
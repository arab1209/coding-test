class `명예의 전당` {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var topThree = mutableListOf<Int>()
        var count:Int = 0

        for(i in 0 until score.size) {
            topThree.add(score[i])
            topThree.sort()
            if(i >= k) {
                count++
            }
            answer += topThree[count]
        }
        return answer
    }
}
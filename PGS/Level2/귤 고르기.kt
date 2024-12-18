class `귤 고르기` {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var count:Int = k

        return tangerine.groupBy{ it }.values.map{ it.size }.sortedDescending().map{
            if(count > 0) {
                answer++
                count -= it
            }
        }
    }
}
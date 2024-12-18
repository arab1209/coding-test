class 덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var startData = section[0]
        var answer: Int = 1

        for(i in 0 until section.size) {
            if(section[i] <= startData+m-1) continue
            else startData = section[i]
            answer++
        }
        return answer
    }
}
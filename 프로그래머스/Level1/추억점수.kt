class 추억점수 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in photo) {
            var sum: Int = 0
            for (j in i) {
                if (name.contains(j)) {
                    sum += yearning[name.indexOf(j)]
                }
            }
            answer += sum
        }
        return answer
    }
}
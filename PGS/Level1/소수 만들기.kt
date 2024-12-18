class `소수 만들기` {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    var temp = nums[i] + nums[j] + nums[k]
                    if ((2 until temp).none { temp % it == 0 }) answer++
                }
            }
        }

        return answer
    }
}
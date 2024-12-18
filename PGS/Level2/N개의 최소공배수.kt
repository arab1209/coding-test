class `N개의 최소공배수` {
    fun solution(arr: IntArray): Int {
        var answer = arr.maxOrNull()!!

        while (true) {
            var count: Int = 0
            arr.forEach {
                if (answer % it == 0) count++
            }

            if (count == arr.size) break else answer += arr.maxOrNull()!!
        }

        return answer
    }
}
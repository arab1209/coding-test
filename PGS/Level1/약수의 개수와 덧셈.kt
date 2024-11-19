class `약수의 개수와 덧셈` {
    class Solution {
        fun solution(left: Int, right: Int): Int {
            var answer: Int = 0

            return (left..right).map { i ->
                if ((1..i).filter {
                        i % it == 0
                    }.size % 2 == 0) i else -i
            }.sum()
        }
    }
}
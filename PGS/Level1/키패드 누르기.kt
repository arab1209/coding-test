class `키패드 누르기` {
    fun solution(numbers: IntArray, hand: String): String {
        var answer: String = ""

        var lastLeft = 10
        var lastRight = 12

        numbers.forEach {
            val number = if (it == 0) 11 else it
            when (it) {
                in listOf(1, 4, 7) -> {
                    lastLeft = number
                    answer += "L"
                }

                in listOf(3, 6, 9) -> {
                    lastRight = number
                    answer += "R"
                }

                else -> {
                    val targetRow = (number - 1) / 3
                    val targetCol = (number - 1) % 3

                    val leftDistance = abs(targetRow - (lastLeft - 1) / 3) + abs(targetCol - (lastLeft - 1) % 3)
                    val rightDistance = abs(targetRow - (lastRight - 1) / 3) + abs(targetCol - (lastRight - 1) % 3)

                    if (leftDistance < rightDistance || (leftDistance == rightDistance && hand == "left")) {
                        lastLeft = number
                        answer += "L"
                    } else {
                        lastRight = number
                        answer += "R"
                    }
                }
            }
        }

        return answer
    }
}
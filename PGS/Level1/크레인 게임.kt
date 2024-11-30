class `크레인 게임` {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val temp = mutableListOf<Int>()

        for (i in moves) {
            for (j in board.indices) {
                if (board[j][i - 1] != 0) {
                    val k = board[j][i - 1]
                    board[j][i - 1] = 0

                    if (temp.isNotEmpty() && temp.last() == k) {
                        temp.removeAt(temp.size - 1)
                        answer += 2
                    } else {
                        temp.add(k)
                    }
                    break
                }
            }
        }
        return answer
    }
}
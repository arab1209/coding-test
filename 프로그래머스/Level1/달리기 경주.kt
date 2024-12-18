/*
처음에는 배열을 이용해서 indexOf() 로 해결할려 했으나 선형구조로 인해 배열의 크기가 커지면 커질수록
시간이 비효율적으로 잡아먹는다
반면 HashMap 구조는 key-value 구조로 특정 키에 대한 값을 검색하는 시가이나 업데이트 하는 상수 시간(O(1))에 수렴한
그래서 반복문의 크기가 커져도 똑같은 시간으로 해결이 가능했다
 */

class `달리기 경주` {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val player = players.withIndex().associate { it.value to it.index }.toMutableMap()

        for (calling in callings) {
            val index = player[calling]!!

            if (index > 0) {
                val prevPlayer = players[index - 1]

                players[index - 1] = calling
                players[index] = prevPlayer

                player[calling] = index - 1
                player[prevPlayer] = index
            }
        }

        return players
    }
}
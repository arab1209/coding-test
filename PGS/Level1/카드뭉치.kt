class 카드뭉치 {
    /* 처음 시도한 코드
    20, 21, 24번 실패

    class Solution {
        fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
            var answer: String = "Yes"

            var idx:Int = 0
            var idx2:Int = 0

            for(i in goal) {
                if(cards1.contains(i)) {
                    card1 += i
                }
                if(cards2.contains(i)) {
                    card2 += i
                }
            }

            if(!card1.contentEquals(cards1) || !card2.contentEquals(cards2)) {
                answer = "No"
            }

            return answer
        }
    }*/

    // 두번째 작성 코드
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"

        var idx1: Int = 0
        var idx2: Int = 0

        for (i in goal) {
            if (idx1 < cards1.size && cards1[idx1] == i) {
                idx1++
            } else if (idx2 < cards2.size && cards2[idx2] == i) {
                idx2++
            } else {
                answer = "No"
            }
        }
        return answer
    }
}
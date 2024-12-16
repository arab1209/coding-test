class `flag에 따른 값 변환하기` {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if(flag) a + b else a - b
    }
}
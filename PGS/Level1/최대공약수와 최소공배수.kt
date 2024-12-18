class `최대공약수와 최소공배수` {
    fun solution(n: Int, m: Int): IntArray {
        val h: Int = if (n > m) gcd(n, m) else gcd(m, n)
        return intArrayOf(h, (n * m) / h)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
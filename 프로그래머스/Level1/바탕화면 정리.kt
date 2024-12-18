class `바탕화면 정리` {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        var lux = -1
        var luy = 0
        var rdx = 0
        var rdy = 0

        for (i in 0 until wallpaper.size) {
            wallpaper[i].forEachIndexed { j, k ->
                if (k == '#') {
                    if (lux == -1) {
                        lux = i
                        luy = j
                    }
                    if (luy > j) luy = j
                    if (rdy <= j) rdy = j + 1
                    rdx = i + 1
                }
            }
        }

        return intArrayOf(lux, luy, rdx, rdy)
    }
}
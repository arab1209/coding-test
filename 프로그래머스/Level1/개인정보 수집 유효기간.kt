class `개인정보 수집 유효기간` {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
        val localDate1 = LocalDate.parse(today, formatter)

        privacies.forEachIndexed { i, k ->
            val (date, termCode) = k.split(" ")
            val temp = date.split(".")
            val (year, month, day) = temp.map { it.toInt() }

            val totalMonth = month + (terms.find { it.contains(termCode) }?.split(" ")?.last()?.toIntOrNull() ?: 0)


            var changeYear = year + totalMonth / 12
            var changeMonth = totalMonth % 12

            if (changeMonth == 0) {
                changeMonth = 12
                changeYear--
            }

            var changeDay = if (day == 1) 28 else day - 1

            if (changeDay == 28) changeMonth--

            if (changeMonth == 0) {
                changeMonth = 12
                changeYear--
            }

            val localDate2 = LocalDate.parse(
                "${changeYear}.${String.format("%02d", changeMonth)}.${
                    String.format(
                        "%02d", changeDay
                    )
                }", formatter
            )

            if (localDate2.isBefore(localDate1)) answer += i + 1
        }

        return answer
    }
}
import java.util.Scanner

class `3003` {
    fun main() = with(Scanner(System.`in`)) {
        var temp = arrayOf(1, 1, 2, 2, 2, 8)

        for(i in temp) {
            print("${i - nextInt()} ")
        }
    }
}
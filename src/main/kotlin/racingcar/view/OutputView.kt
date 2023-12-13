package racingcar.view

class OutputView {
    companion object {
        fun printResultComment() {
            println()
            println("실행 결과")
        }

        fun printResult(cars: Map<String, Int>) {
            for (car in cars){
                print("${car.key} : ")
                printForward(car.value)
            }
            println()
        }

        fun printWinner(winner: List<String>) {
            val winners = winner.joinToString(", ")
            print("최종 우승자 : ${winners}")
        }

        private fun printForward(forwardCount: Int) {
            for (i in 0 until forwardCount) {
                print("-")
            }
            println()
        }
    }
}
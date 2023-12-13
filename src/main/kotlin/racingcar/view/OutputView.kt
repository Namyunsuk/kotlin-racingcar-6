package racingcar.view

class OutputView {
    companion object {
        fun printResultComment() {
            println()
            println("실행 결과")
        }

        fun printResult(cars: Map<String, Int>) {
            cars.forEach { (name, forwardCount) -> print("${name} : ${printForward(forwardCount)}\n") }
            println()
        }

        fun printWinner(winner: List<String>) {
            val winners = winner.joinToString(",")
        }

        private fun printForward(forwardCount: Int) {
            for (i in 0 until forwardCount) {
                print("-")
            }
        }
    }
}
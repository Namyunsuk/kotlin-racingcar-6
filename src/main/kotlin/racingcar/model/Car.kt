package racingcar.model

import racingcar.view.OutputView

class Car(private val raceCalculation: RaceCalculation) {
    private val cars = mutableMapOf<String, Int>()

    fun addCars(carNames: List<String>) {
        for (carName in carNames) {
            cars[carName] = DEFAULT_FORWARD_COUNT
        }
    }

    fun moveForward(carName: String) {
        val randomNum = raceCalculation.generateRandomNum()
        if (raceCalculation.calculateForward(randomNum)) {
            val forwardCount = cars[carName]
            if (forwardCount != null) {
                cars[carName] = forwardCount + FORWARD
            }
        }
    }

    fun attemptRace() {
        for (carName in cars.keys) {
            moveForward(carName)
        }
        OutputView.printResult(cars)
    }

    fun findWinners(): List<String> {
        return raceCalculation.calculateWinner(cars)
    }

    companion object {
        const val DEFAULT_FORWARD_COUNT = 0
        const val FORWARD = 1
    }
}
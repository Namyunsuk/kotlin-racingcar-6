package racingcar.controller

import racingcar.model.Car
import racingcar.model.RaceCalculation
import racingcar.view.InputView
import racingcar.view.OutputView

class CarController {
    fun start() {
        val raceCalculation = RaceCalculation()
        val car = Car(raceCalculation)
        val carName = InputView.enterCarsName()
        val attemptsCount = InputView.enterAttempsCount()

        car.addCars(carName)
        OutputView.printResultComment()
        for (attemptCount in 0 until attemptsCount) {
            car.attemptRace()
        }
        val winners = car.findWinners()
        OutputView.printWinner(winners)
    }
}
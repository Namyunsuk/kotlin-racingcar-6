package racingcar.model

import camp.nextstep.edu.missionutils.Randoms

class RaceCalculation {
    fun generateRandomNum(): Int {
        return Randoms.pickNumberInRange(0, 9)
    }

    fun calculateForward(randomNum: Int): Boolean {
        return randomNum >= FORWARD_NUM
    }

    fun calculateWinner(cars: Map<String, Int>): List<String> {
        val maxForwardCount = cars.values.max()
        return cars.filter { (carName, forwardCount) -> forwardCount == maxForwardCount }.keys.toList()
    }

    companion object {
        const val FORWARD_NUM = 4
    }
}
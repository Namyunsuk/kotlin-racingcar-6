package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.utils.UserInputException

class InputView {
    companion object {
        fun enterCarsName(): List<String> {
            println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
            val userInput = Console.readLine()
            return UserInputException.checkCarName(userInput)
        }

        fun enterAttempsCount(): Int {
            println("시도할 횟수는 몇 회인가요?")
            val userInput = Console.readLine()
            return UserInputException.checkAttemptsValue(userInput)
        }
    }
}
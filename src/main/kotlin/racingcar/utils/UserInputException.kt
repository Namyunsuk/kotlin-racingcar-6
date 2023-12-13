package racingcar.utils

class UserInputException {

    companion object {
        fun checkCarName(userInput: String): List<String> {
            val carName = userInput.split(",")
            require(checkNameLen(carName)) { "자동차 이름은 5자 이하여야 합니다." }
            return carName
        }

        fun checkAttemptsValue(userInput: String): Int {
            require(isNumber(userInput)) { "시도 횟수의 입력 값은 숫자여야 합니다." }
            return userInput.toInt()
        }

        fun checkNameLen(carName: List<String>): Boolean {
            return carName.all { it.length <= 5 }
        }

        fun isNumber(userInput: String): Boolean {
            for (numberIndex in userInput.indices) {
                if (userInput[numberIndex].code < '0'.code || userInput[numberIndex].code > '9'.code) {
                    return false
                }
            }
            return true
        }
    }
}
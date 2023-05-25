package solutions.HLO

object HelloSolution {
    fun hello(friendName: String): String {
        if (friendName.startsWith("X")) {
            return "Ole!"
        } else {
            return "Hello, ${friendName}!"
        }
    }
}


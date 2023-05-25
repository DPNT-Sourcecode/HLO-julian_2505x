package solutions.HLO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloSolutionTest {

    @Test
    fun hello() {
        Assertions.assertEquals("Hello, World!", HelloSolution.hello("x"))
    }
}
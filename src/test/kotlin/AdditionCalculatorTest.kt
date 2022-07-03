import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AdditionCalculatorTest {

  @Test
  fun `sum`() {
    // given
    val additionCalculator = mockk<AdditionCalculator>()
    every { additionCalculator.calculate(1, 3) } returns 4

    // when
    val result = additionCalculator.calculate(1, 3)

    // then
    assertEquals(4, result)
  }

  @Test
  fun `call verify`() {
    // given
    val additionCalculator = mockk<AdditionCalculator>()
    every { additionCalculator.calculate(1, 3) } returns 4

    // when
    val result = additionCalculator.calculate(1, 3)

    // then
    verify { additionCalculator.calculate(1, 3) }
  }
}

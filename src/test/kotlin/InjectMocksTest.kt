import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class InjectMocksTest {

  @MockK
  lateinit var additionCalculator: AdditionCalculator

  @MockK
  lateinit var subtractionCalculator: SubtractionCalculator

  @InjectMockKs
  lateinit var calculator: Calculator

  @Test
  fun `inject mock`() {
    // given
    val num1 = 1
    val num2 = 2

    every { additionCalculator.calculate(num1, num2) } returns 3
    every { subtractionCalculator.calculate(num1, num2) } returns -1

    // when
    val actualResult = calculator.calculate(num1, num2)

    // then
    val expectedResult = CalculationResult(
      addition = 3,
      subtraction = -1
    )
    assertEquals(expectedResult, actualResult)
  }
}

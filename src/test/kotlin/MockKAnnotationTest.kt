import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class MockKAnnotationTest {

  @MockK
  lateinit var additionCalculator: AdditionCalculator

  @Test
  fun sum() {
    // given
    every { additionCalculator.calculate(1, 3) } returns 4

    // when
    val result = additionCalculator.calculate(1, 3)

    // then
    assertEquals(4, result)
  }
}

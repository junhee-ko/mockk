import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RelaxedMockTest {

  @Test
  fun `relaxed`() {
    // given
    val additionCalculator = mockk<AdditionCalculator>(relaxed = true)

    // when
    val result = additionCalculator.calculate(1, 2)

    // then
    assertEquals(0, result)
  }
}

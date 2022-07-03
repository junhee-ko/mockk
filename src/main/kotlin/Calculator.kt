class Calculator(
  private val additionCalculator: AdditionCalculator,
  private val subtractionCalculator: SubtractionCalculator
) {

  fun calculate(num1: Int, num2: Int): CalculationResult {
    val additionResult = additionCalculator.calculate(num1, num2)
    val subtractionResult = subtractionCalculator.calculate(num1, num2)

    return CalculationResult(
      addition = additionResult,
      subtraction = subtractionResult
    )
  }
}

data class CalculationResult(
  val addition: Int,
  val subtraction: Int
)

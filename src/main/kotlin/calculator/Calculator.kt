package calculator

fun main() {
    val expression = "-1,2,3"
    val stringAddCalculator = StringAddCalculator.calculate(ExpressionFactory.determine(expression))
    println(stringAddCalculator)
}
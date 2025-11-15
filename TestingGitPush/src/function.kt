fun main() {
    var num1 = 5
    var num2 = 10

    var sum = addition(num1, num2)
    println("Sum of $num1 and $num2 is: $sum")

}

fun addition(num1: Int, num2: Int): Int{
    return num1 + num2
}
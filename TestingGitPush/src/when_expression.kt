fun main() {
    var a = 10
    var b = 5
    var opr = "div"

    when (opr){
        "add" -> {println("Addition is : ${a+b}")}
        "sub" -> println("Subtraction is : ${a-b}")
        "mul" -> println("Multiplication is : ${a*b}")
        "div" -> println("Division is : ${a/b.toFloat()}")
        "mod" -> println("Modulus is : ${a%b}")
        else -> println("Invalid operation")
    }
}
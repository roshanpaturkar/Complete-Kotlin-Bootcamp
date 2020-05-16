package operationsAndOperators

fun main(args: Array<String>) {

    var a = 1
    var b = 5

    var numOne: Float = 1f
    var numTwo: Float = 5f

    println("1. Division is ${ a / b}")
    println("2. Division is ${ numOne / numTwo}")
    println("3. Division is ${ a.toFloat() / b.toFloat()}")
    println("4. Division is ${ a.toFloat() / b}")
    println("5. Division is ${ a / b.toFloat()}")

}
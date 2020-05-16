package classesAndObjects

fun main(args: Array<String>) {

    var mull = multiply(3,5)

    println("Multiplication : $mull and Division : ${mull/ divide(2)}")
    println("My name is ${name("Roshan Paturkar")}")

}

fun multiply(num1: Int, num2: Int): Int{

    var result = num1 * num2

    return result

}
fun divide(num1: Int): Int{
    return num1
}
fun name(name: String): String{

    return name

}
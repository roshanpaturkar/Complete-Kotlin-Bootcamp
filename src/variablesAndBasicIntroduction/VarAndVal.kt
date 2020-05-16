package variablesAndBasicIntroduction

fun main(args: Array<String>){

    /*
        var = These keyword is to change variable value dynamically
        val = It is static way of assining value to variable that should not change throughout the program
    */

    var name = "Roshan"
    name = "Gaurav"

    val lastName = "Paturkar"

    val url = "www.google.com"

    //lastName = "Some thing else" //It will through error (val can not reassigned)

    println("$name $lastName")
    println(url)

}
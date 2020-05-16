package decisionMaking

fun main(args: Array<String>) {

    var one = 10
    var two = 20
    var three = 30

    if ((one < two) && (one < three)){ //All the condition is true (Logical AND = &&)

        println("Condition is true !")

    }else{

        println("Condition is false !")

    }

    if ((one < two) || (one < three)){ //Atleast one condition is true (Logical OR = ||)

        println("Condition is true !")

    }else{

        println("Condition is false !")

    }

    if (!(one < two) && (one < three)){ //Convert the condition inverse (Logical NOT = !)

        println("Condition is true !")

    }else{

        println("Condition is false !")

    }

}
package decisionMaking

fun main(args: Array<String>) {

    print("Enter number between 1-5 : ")
    var num = readLine()!!.toInt()

    when (num){

        1-> println("You pressed 1")
        2-> println("You pressed 2")
        3-> println("You pressed 3")
        4-> println("You pressed 4")
        5-> println("You pressed 5")

        else-> {
            println("$num is not in range !")
        }

    }

}
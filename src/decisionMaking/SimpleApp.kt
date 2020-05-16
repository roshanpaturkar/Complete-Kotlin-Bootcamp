package decisionMaking

fun main(args: Array<String>) {

    var isTruse: Boolean = false

    do {

        print("How many siblings you are ?  : ")
        var num = readLine()!!.toInt()

        when(num){

            12 -> {
                println("Your correct!")
                isTruse = true
            }
            else -> {

                println("Wrong Answer !")

            }

        }

    }while (isTruse == false)

}
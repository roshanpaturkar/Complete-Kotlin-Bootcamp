package filesAndIO

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    menu()

}
fun menu(){

    println("1. Write \n2. Read \n3. Exit")
    print("Enter your Choice : ")
    var choice = readLine()!!.toInt()
    var messsage: String?

    when(choice){

        1->{
            print("Enter the message : ")
            messsage = readLine().toString()

            if (messsage.equals("")){
                println("Enter the message to insert !")
            }else{
                writetoFile(messsage)
            }
        }

        2->{
            readfromFile()
        }

        3->{
            println("Exiting...")
        }

    }

}
fun writetoFile(message: String){
    try {

        var fileWriter = FileWriter("apple.txt", true) //By default append is false
        println("Writing...")
        fileWriter.write(message + "\n")
        fileWriter.close()
        println("Done...")

    }catch (ex: Exception){

        println("Exception Found : ${ex.message}")

    }
}
fun readfromFile(){
    var char: Int?
    var fileReader = FileReader("apple.txt")

    println("Reading...")
    try {
        do {
            char = fileReader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        println("Exception found : ${ex.message}")
    }

    fileReader.close()
}
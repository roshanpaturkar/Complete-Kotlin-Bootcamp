package filesAndIO

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    print("Enter the message : ")
    var message = readLine().toString()

    if (message.equals("")){
        println("Please enter something to insert !")
    }else{
        writeToFile(message)
    }

    readFile()

}

fun writeToFile(message: String){

    try {

        var fileWriter = FileWriter("message.txt", true) //By default append is false
        fileWriter.write("\n" + message)
        fileWriter.close()

    }catch (ex: Exception){

        println("Exception Found : ${ex.message}")

    }

}

fun  readFile(){

    var char: Int?
    var fileReader = FileReader("message.txt")

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
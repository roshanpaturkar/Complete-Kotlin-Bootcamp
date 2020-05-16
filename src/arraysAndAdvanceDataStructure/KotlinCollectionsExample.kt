package arraysAndAdvanceDataStructure

fun main(args: Array<String>) {

    //By default listOf is immutable

    //immutable listof
    var immList = listOf<String>("Roshan", "Gaurav", "Ashish", "Lutika", "Irfan") //we can also pass any data type using (listOf())
    //immList[1] = "Ayon" // It will cause error
    for (item in immList) println("Item: $item")

    //mutable list
    var muList = mutableListOf<String>("Roshan", "Gaurav", "Ashish", "Lutika", "Irfan")
    muList[1] = "Ayon"
    for (item in muList) println("Item: $item")

    //HashMap
    var hashMap = hashMapOf(1 to "Roshan", 2 to "Gaurav", 3 to "Ashish", 4 to "Lutika", 5 to "Irfan")
    for (item in hashMap.keys) println("Items: ${hashMap.get(item)}")

    //Array
    var array = arrayOf(1, 2, 3, 4, 5, 6)
    for (index in array) println("Items: $index")

}
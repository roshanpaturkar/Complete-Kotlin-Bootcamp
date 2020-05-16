package arraysAndAdvanceDataStructure

fun main(args: Array<String>) {

    var array = Array<Int>(10){2}

    for (i in 0..array.size-1){
        array[i] = i
    }


//    for (element in array){ // Print using array object
//        println(array[element])
//    }

    for (index in 0..array.size-1){ //// Print using array index
        println(array[index])
    }

}
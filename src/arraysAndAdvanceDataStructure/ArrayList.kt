package arraysAndAdvanceDataStructure

fun main(args: Array<String>) {

    var arrayList = ArrayList<String>()

    arrayList.add("apple")
    arrayList.add("google")
    arrayList.add("dell")
    arrayList.add("asus")

    for (index in 0..arrayList.size-1){
        println(arrayList[index])
    }

    println("-----------------------------------------")

    arrayList.set(2, "android")
    arrayList.remove("dell")

    for (element in arrayList){
        println(element)
    }

}
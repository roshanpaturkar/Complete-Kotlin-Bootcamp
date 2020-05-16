package arraysAndAdvanceDataStructure

// HashMap = key-value pair

fun main(args: Array<String>) {

    //var hashmap = HashMap<Any, Any>() // It can hold any type of key and value (kotlin feature)
    var hashMap = HashMap<String, String>()

    hashMap.put("name", "Roshan")
    hashMap.put("job", "Student")
    hashMap.put("number","9890401440")

    for (key in hashMap.keys) println(hashMap.get(key))

}
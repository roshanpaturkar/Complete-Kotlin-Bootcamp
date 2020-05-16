package classesAndObjects

class House(type: String, price: Int, yearBuilt: Int, owner: String){

    var type: String? = null
    var price: Int? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init {                      //Initilize all properties

        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this.owner = owner

    }

    fun GetType(): String? { /// Getters and Setters are the optional in kotlin. It is bad practice in kotlin
        return this.type
    }

    fun SetType(type: String){  /// Getters and Setters are the optional in kotlin. It is bad practice in kotlin

        this.type = type

    }

}

fun main(args: Array<String>) {

    var myHouse = House("2 BHK", 120000, 2017, "Roshan Paturkar")
    var secondHouse = House("4 BHK", 4500000, 2018, "Gaurav Paturkar")

    myHouse.SetType("10 BHK")
    println("Type: ${myHouse.GetType()}")

    //println(myHouse.price)
    //println(secondHouse.owner)

}
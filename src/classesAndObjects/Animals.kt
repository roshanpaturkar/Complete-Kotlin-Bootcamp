package classesAndObjects

open class Animals(){

    /*
        public  = By default every thing is public in kotlin
        private = Private methods or variables only can access in the class. It will not be visible outside of the class
                    (we can access private variable by using SETTERS and GETTERS)
        protected = It is same as private and also accessible by subclasses
                    (we can access protected variables in subclass by using super keyword (eg. super.numLegs))
    */

    var name: String? = null
    var color: String? = null
    private var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int): this(){

        this.name = name
        this.color = color
        this.numLegs = numLegs

//        println("Object : ${this.name}")
//        println("Object : ${this.color}")
//        println("Object : ${this.numLegs}")

    }

    constructor(name: String, color: String): this(){

        this.name = name
        this.color = color

    }

    fun setNumLegs(numLegs: Int){
        this.numLegs = numLegs
    }


    fun showAll(){

        println("---------------------------------------------")
        println("Name : ${this.name}")
        println("Color : ${this.color}")
        println("Number Of Legs : ${this.numLegs}")
        println("---------------------------------------------")

    }

}

class Lion: Animals(){

}

fun main(args: Array<String>) {

    var animal = Animals("Dog", "Brown", 4)
    var animal2 = Animals()
    var animal3 = Animals("Murga","Lal")

    animal2.name = "Zebra"
    animal2.color = "Black and White"
    animal2.setNumLegs(4)

    animal.showAll()
    animal2.showAll()
    animal3.showAll()

//    var lion = Lion()
//
//    lion.color = "Yellow";
//
//    println("Color Of Lion : "+lion.color)

}
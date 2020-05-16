package advanceOOPS

//Abstract Classes = not meant to be instantiated and they also can have a mixture of functions declared with or without implementation

abstract class GraphicObject{

    fun moveToNewXY(newX: Int, newY: Int){
        println("Moved to new X($newX) and Y($newY)")
    }

    //fun drawLine() // It will cause error

    abstract fun drawLine()
    abstract fun drawRect()

}

class Drawing: GraphicObject() {


    override fun drawLine() {
        println("Drawing new line !")
    }

    override fun drawRect() {
        println("Drawing new rectangle !")
    }

}

fun main(args: Array<String>){

    //var graphicObject = GraphicObject() // Can not be instantiated

    var draw = Drawing()

    draw.drawLine()
    draw.drawRect()

    draw.moveToNewXY(5,8)

}
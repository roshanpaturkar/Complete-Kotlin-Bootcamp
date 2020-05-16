package advanceOOPS

// Interface = Classes that have methods without bodies

interface InputHandler{

    fun clicked()
    fun singleClicked()
    fun doubleClicked()

}

class Button: InputHandler{

    override fun clicked() {
        println("Button Clicked !")
    }

    override fun singleClicked() {
        println("Single Clicked !")
    }

    override fun doubleClicked() {
        println("Double Clicked !")
    }

}

fun main(args: Array<String>) {

    var button = Button()

    button.clicked()
    button.singleClicked()
    button.doubleClicked()

}
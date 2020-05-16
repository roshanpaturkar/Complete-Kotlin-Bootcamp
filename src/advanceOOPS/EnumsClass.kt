package advanceOOPS

// Enum Class = Allow us to represent collection of information (fixed or static information)

enum class Cards{

    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS

}

enum class Directions{


    NORTH,
    SOUTH,
    EAST,
    WEST

}

fun main(args: Array<String>) {

    var card = Cards.DIAMONDS
    var directions = Directions.NORTH

    if (card == Cards.DIAMONDS) println("Hira !")
    if (directions == Directions.NORTH) println("Varta Challa !")

}
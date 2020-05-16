package advanceOOPS

class Login<T> (userName: T, password: T){ // <T> can be any thing (eg. <Temp>,<Apple>,<Google>,etc)
    init {
        println("Name : $userName \t Password : $password")
    }
}

class Person(user: String, passwd: String){

    var user: String? = null
    var passwd: String? = null

    init {

        this.user = user
        this.passwd = passwd

        println("You Hit Person Class !")
    }

}

fun main(args: Array<String>) {

    var login = Login<String>("apple","redhat")
    var login2 = Login<Int>(4,8)
    var login3 = Login<Boolean>(true, false)

    var person = Person("Roshan","Paturkar")

    var user = Login<Person>(person, person)

}
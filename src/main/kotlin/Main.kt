fun main() {
    printsChars()
    println(takesstring("My name is Veronica.I am a student at AkiraChix"))
    takesName("Nelson")
    println(takesparams("Ndemo Veronica",21))

}
//prints 1st, 3rd and 4th chars of akiraChix
fun printsChars(){

    val akiraChix = "akiraChix"
    val a = akiraChix[0]
    val  i = akiraChix[2]
    val r = akiraChix[3]
    println("a" + " i"  + " r")


}
//takes two parameters and returns a string
fun takesparams(name: String, age: Int): String{
    return ("Hi my name is " + name + " and i am " + age + " years old")
//
}
//takes in a string and returns its length
fun takesstring(string: String): Int{
    var theString = string
    return (theString.length)
}

fun  takesName(name: String): Unit{
    var mainString = if (name.equals("Veronica")) {
        println("Thats me")
    } else {
        println("I don't know who that is")
    }
    return mainString
}

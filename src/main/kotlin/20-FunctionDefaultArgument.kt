fun sayHello(firsName: String = "Anonymous", lastName: String = "") {
    println("Hello $firsName $lastName");
}
fun hello(firsName: String, lastName: String? = null) {
    if(lastName == null){
        println("Hello $firsName");
    } else {
        println("Hello $firsName $lastName");
    };
}
fun main() {
    sayHello("Otniel", "Kevin");
    sayHello("Kevin");
    sayHello();
    hello("Leinto");
    hello("Leinto", "Lei");
}
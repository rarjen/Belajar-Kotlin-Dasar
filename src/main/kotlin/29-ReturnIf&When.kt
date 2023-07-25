fun main() {
    /*
    Return If & When
    - Kadang salam sebuah function, kita sering menggunakan If expression atau when expression, lalu di dalam blok nya kita mengembalikan
      nilai untuk sebuah function
    - Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
     */

    // Return if
    fun sayHello(name: String = ""): String {
        return if (name == ""){
            "Hello Bro!";
        } else {
            "Hello $name";
        }
    };

    println(sayHello());
    println(sayHello("Otniel Kevin Abiel"));

    // Rerurn When
    fun helloWorld(word: String = ""): String {
        return when (word) {
            "" -> "Hello Alien";
            else -> "Hello ${word}"
        }
    }
    println(helloWorld());
    println(helloWorld("World!"));
}
fun satu() {
    //contohHello();
}

fun dua() {
    // Error karena fun contohHello dapat di akses hanya oleh main
    //contohHello();
}

fun main() {
    /*
    Function Scope
    - Function scope adalah ruang lingkup dimana sebuah function bisa diakses
    - Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
    - Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu, maka kita bisa membuat function
      di dalam function
     */

    fun contohHello(name: String): Unit {
        println("Hello $name");
    };

    contohHello("Kevin");

}
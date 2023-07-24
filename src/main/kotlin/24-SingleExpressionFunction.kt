fun double(a: Int): Int = a * 2; // akan otomatis dijadikan return value

fun hi(name: String): Unit = println("Hi $name"); // deklarasi unit

fun printKata(word: String) = println("Kata yang anda input: $word"); // tanpa deklarasi unit

fun main() {
    /*
    Single Expression Function
    - Kadang kita sering membuat function yang sangat sederhana
    - Misal function yang hanya berisikan kode blok sederhana, misal hanya 1 baris
    - Jika kita mengalami hal seperti ini, kita bisa mengubahnya menjadi single expression function
    - Single expression function adalah deklarasi function hanya dengan 1 baris kode
    - Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan) setelah deklarasi nama function dan tipe data
      pengembalian function
     */

    println(double(2)); //4
    hi("Kevin"); // Hi Kevin
    printKata("Hallo Bang");
}
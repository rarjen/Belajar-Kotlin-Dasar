fun String.hello(): String{
    return "Hello $this"; // this disini adalah melakukan akses ka data string
    // dengan demikian, sekarang di tipe data string di kotlin mempunyai tipe data hello (Harap hati-hati!)
}

fun Int.number(): Int {
    return this;
}

fun String.sayHello(): Unit = println("Hello $this");
fun Int.sayNumber() : Unit = println(2);

fun main() {
    /*
    Extension Function
    - Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
    - Extension function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakannya, karena jika terlalu banyak digunakan,
      akan membuat program sulit dimengerti, karena terlihat seperti magic
    - Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda . (titik)
    - Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this
    - Ini dapat digunakan saat kita menggunakan library orang dan tidak dapat diubah kodenya. Maka kita bisa menggunakan extension fun ini.
     */

    val name: String = "Kevin";
    val hello: String = name.hello();
    println(hello); //Hello Kevin

    val nama = "Leinto";
    println(nama.hello()); //Hello Leinto

    // Here is the magic
    "Abiel".sayHello(); //Hello Abiel


    var someNumber: Int = 10;
    println(someNumber);

}
fun printHello (name: String?): Unit {
    if (name == null){
        println("Hello Bro!");
    } else {
        println("Hello $name");
    }
}

fun main() {
    /*
    Unit Returning Function
    - Function ada 2 jenis, pertama tidak mengembalikan nilai, yang kedua mengembalikan nilai
    - Sebenarnya, function yang sudah kita buat sebelumnya, dia mengembalikan tipe data unit, dimana unit adalah tanda bahwa function tsb tdk
      mengembalikan apa-apa.
    - Penulisan unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function, maka secara otomatis dia adalah Unit.
    - Jarang digunakan.
     */

    printHello("Kevin");
    printHello(null);



}
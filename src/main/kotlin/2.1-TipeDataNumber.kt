fun main() {
    /*
    Tipe Data Number
    - Integer Number (Byte-8 , Short-16, Int-32, Long-64)
    - Floating Point Number
    */

    var age: Byte = 30;
    var height: Int = 170;
    var distance: Short = 2000;
    var balance: Long = 100000000L; // Untuk long harus ditambahkan huruf L (memaksa tipe data menjadi long) jika tidak ada L maka akan di kira Int

    //Jika ada diluar range maka akan error

    println(age)
    println(height)
    println(distance)
    println(balance)

}
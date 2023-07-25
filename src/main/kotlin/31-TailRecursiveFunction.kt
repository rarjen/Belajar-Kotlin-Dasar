fun main() {
    /*
    Recursive Function
    - Recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada keterbatasan dalam penggunaan recursive
    - Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya sendiri terlalu dalam, maka bisa dimungkinkan
      akan terjadi error stack overflow

      Stack Overflow Error
        factorial(5)
        factorial(5) => 5 * factorial(4)
        factorial(5) => 5 * factorial(4) => 4 * factorial(3)
        factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2)
        factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1)
        factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1) => 1

       Tail Recursive Function
       - Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
       - Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
       - Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi looping biasa ketika dijalankan
       - Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada syarat-syarat nya

        Syarat Tail Recursive Function
        - Tambahkan tailrec di functionnya
        - Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain
     */

    // dengan function tailerc kotlin akan mengakali merubah menjadi looping saat di compile
    tailrec fun display(value: Int) {
        println("Recursive $value");
        if (value > 0) {
            display(value - 1);
        }
    }
//    println(display(10000));

    //Kode: Tail Recursive Factorial Function
    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total;
            else -> factorialTail(value - 1, total * value); //hanya memanggil functionya sendiri
        }
    }

    println(factorialTail(100));
}
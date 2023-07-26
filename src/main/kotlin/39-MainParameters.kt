fun main(args: Array<String>) { // Bisa kita passing dari luar params nya
    /*
    Main Parameters
    - Kadang saat menjalankan program, kita butuh input parameter dari luar.
    - Bisa untuk konfigurasi program, ataupun yang lainnya.
    - Kotlin mendukung parameter untuk main function
     */

    for (value in args){
        println(value);
    }
}
fun main() {
    /*
    Variable
    - Mutable: var -> bisa diubah/ditimpa (harus dengan tipe data yang sama)
    - Immutable: val -> tidak bisa diubah/ditimpa

    DIREKOMENDASIKAN MENGGUNAKAN VARIABLE IMMUTABLE! (kyk const di JS ygy)
     */

    // Mutable
    var firstName:String = "Otniel";
    var lastName = "Kevin"; // Deklarasi tipe data adalah opsional
    println(lastName);

    lastName = "Abiel";
    println(lastName); // Data akan ditimpa


    // Immutable
    val phi = 3.14;
    // phi = 3.10; -> error
    println(phi);

    // Untuk tipe data long tetap harus dituliskan L pada value nya
    val balance = 10_000_000_000L;
    println(balance)

    // Sedangakan untuk tipe data byte dan short harus tetap di deklarasikan tipe data
    val byte:Byte = 8;
    val short:Short = 100;
    println(byte)
    println(short)

}
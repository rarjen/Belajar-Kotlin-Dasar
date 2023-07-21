fun main() {
    /*
    Tipe Data String
    - Untuk membuat string di Kotlin, kita bisa menggunakan
        -> "(tanda petik 2)" untuk text satu baris
        -> """(tanda petik 3)""" untuk text lebih dari 1 baris
     */

    var myName: String = "Otniel Kevin Abiel";
    var myData: String = """ 
         A11.2020.13015
         Universitas Dian Nuswantoro
    """.trimIndent();

    println(myName);
    println(myData);
}
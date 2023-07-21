const val APP = "Belajar Kotlin";
const val VERSION = "1.0.0";

fun main() {
    /*
    Variable Constants
    - Bersifat Immutable data, bisa diakses untuk keperluan global (Syntax: const val VARIABLE = value)
    - Global berarti dapat di akses dimanapun
    - Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya (best parctice)
    - Hanya dapat di tulis diluat fun main
     */

    println("Welcome to $APP version $VERSION");
}
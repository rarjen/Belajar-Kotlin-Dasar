import com.company.project.util.sayHelloPackage; //hanya import function sayHello
import com.company.project.database.*;

fun main() {
    /*
    Package
    - Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat di Kotlin
    - Dengan menggunakan package, kita bisa merapikan kode program Kotlin yang kita buat
    - Penamaan package di Kotlin biasanya menggunakan huruf kecil semua -> mengikuti style java
    - Jika ingin membuat sub package bisa menggunakan tanda . (titik)
     */
    /*
    Import
    - Secara standar, file Kotlin hanya bisa mengakses file Kotlin lainnya yang berada dalam package yang sama
    - Jika kita ingin mengakses file Kotlin yang berada diluar package, maka kita bisa menggunakan Import
    - Saat melakukan import, kita bisa memilih ingin meng-import bagian tertentu, atau semua file

     */

    sayHelloPackage("Kevin");
    com.company.project.util.sayGoodByePackage("Leinto"); //Bisa langsung disini tanpa perlu keyword import

    println(subs(5, 2)); //3
}
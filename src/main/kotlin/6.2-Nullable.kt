fun main() {
    /*
    Nullable
    - Secara standar, varible di kotlin harus didekalrasikan/diinisialisasikan nilai nya.
    - Jika saat membuat variable, tidak diberi nilai, maka akan error.
    - Kotlin mendukung variable yang boleh null (tidak memiliki data).
    - Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null.
    - Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
    - Penggunaan fitur ini tidak direkomendasikan untuk dilakukan di Kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java.
     */

    var firstName: String? = "Kevin"; // ? menandakan bahwa variable boleh null
    firstName = null;

    // Error karena first name bisa null
    // println(firstName.length)

    // Cara akses nullable variable denagan benar
     println(firstName?.length); // memaksa akses nullable variable dengan tanda tanya (sama kyk JS ygy)

    var name:String? = null;
    //name = "Kevin";
    println(name); //null
    println(name?.length); //null
}
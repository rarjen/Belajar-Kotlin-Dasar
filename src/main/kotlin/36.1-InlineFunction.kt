inline fun helloInline(name: () -> String): String {
    return "Hello ${name()}";
}

fun helloLambda(name: () -> String): String { // name kita buat lambda
    return "Hello ${name()}";
}

fun main() {
    /*
    Inline Function
    - Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
    - Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda
      berulang-ulang. Jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
    - Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi Inline Function
    - Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi tidak perlu
      membuat object lambda berulang-ulang
    - Sederhananya saat di compile, lambda akan menjadi function biasa. Sama seperti tail recursive dimana recursive di compile menjadi looping
    - Kelemahannya adalah byte-code nya akan terlalu besar sehingga tidak bisa semuanya menggunakan inline
    - Inline hanya digunakan untuk perulangan yang banyak hingga 100+ sehingga bisa optimize menggunakan inline
    - Lambda => Akan dibikin object trs
     */


    println(helloInline { "Otniel" });
    println(helloInline { "Kevin" });
}
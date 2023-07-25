fun main() {
    /*
    Higher Order Functions
    - Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
    - Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan input yang flexible
      berupa lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
     */

    // transformer adl lambda expression
    fun hello(value: String, transformer: (String) -> String ): String {
        val valueTransformed = transformer(value);
        return "Hello $valueTransformed";
    }

    val upperTransformer: (String) -> String = { value: String -> value.toUpperCase() }; // deklarasi (String) -> String tidak wajib disini
    val lowerTransformer = { value: String -> value.toLowerCase() };
    println(hello("Kevin", upperTransformer));
    println(hello("Abiel", lowerTransformer));
    println(hello("Leinto", { value: String -> value.toLowerCase() })); //bisa langsung dikirim sbeagai paramter (biasa digunakan)


    // Trailing lambda, bisa juga begini asalkan lambda ada pada posisi terakhir.
    // Lebih mudah dibaca (BEST PRACTICE)
    // Fitur opsional
    val result1 = hello("Verstappen") { value: String ->
        value.toUpperCase();
    }
    println(result1);

    val result2 = hello("Norris") { value: String ->
        value.toLowerCase();
    }
    println(result2);

    fun pangkat(value: Int, operasi: (Int) -> Int): Int {
        val result = operasi(value);
        return  result;
    }

    val hasilPangkat = pangkat(3) { value: Int ->
        value * value;
    }
    println("Hasil Pangkat: $hasilPangkat");

}
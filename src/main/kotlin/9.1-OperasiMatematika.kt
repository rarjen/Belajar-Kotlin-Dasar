fun main() {
    var result1: Int = 10 / 3;
    println(result1);

    var result2: Int = 10 + 10 / 2; // akan secara otomatis menggunakan operasi scientific (bagi akan di dahulukan)
    println(result2); //15

    var result3: Double = 10.0 / 3.0; // agar menjadi double
    println(result3);


    var result4 = 10.0 / 4.0; // menjadi otomatis
    println(result4);
}
fun main() {
    /*
    Lambda Expression
    - Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
    - Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
    - Lambda expression secara sederhana adalah function yang tidak memiliki nama
    - Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
    - Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
     */


    // Sebuah fungsi yang dimasukkan kedalam variable

    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase(); //ini adalah scr otomatis menjadi return value dari lambda
    }

    val name = lambdaName("kevin");
    println(name);

    // dua parameter (tidak perlu menggunakan kurung ()
    val sum: (Int, Int) -> Int = { a : Int, b: Int ->
       val result =  a + b;
        result;
    }
    println(sum(2, 2));
}
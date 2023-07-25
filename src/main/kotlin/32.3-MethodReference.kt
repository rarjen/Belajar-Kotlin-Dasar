fun main() {
    // Misal kita mau buat lambda expression tapi dari fun yang sudah ada, jad kita mereferensi pada sebuah function yang sudah ada
    fun toUpper(value: String): String = "Hello ${value.toUpperCase()}"; // function yang hanya mengembalikan 1 baris
    fun sumAngka(a: Int, b: Int): Int = a + b;

    val lambdaName: (String) -> String = ::toUpper; // refers to fun toUpper
    println(lambdaName("otniel"));

    // dengan 2 parameter
    val lambdaSum: (Int, Int) -> Int = ::sumAngka; // refers to fun sumAngka
    println(lambdaSum(5,10));
}
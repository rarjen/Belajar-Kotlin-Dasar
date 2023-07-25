fun main() {
    /*
    Recursive Function
    - Recursive function adalah function yang memanggil function dirinya sendiri
    - Kadang dalam pekerjaan, kita sering menemui kasus dimana menggunakan recursive function lebih mudah dibandingkan tidak menggunakan
      recursive function
    - Contoh kasus yang lebih mudah diselesaikan menggunakan recursive adalah Factorial
     */

    fun factorialLoop(value: Int): Int {
        var result = 1;
        for (i in value downTo 1) {
            result *= i;
        }
        return result;
    }
    println(factorialLoop(3));

    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1;
            else -> value * factorialRecursive(value - 1);
        }
    };
    println(factorialRecursive(5));

    fun factorialRecursiveIf(value: Int): Int {
        return if (value == 1){
            return 1;
        } else {
            value * factorialRecursiveIf(value - 1);
        }
    };
    println(factorialRecursiveIf(5));
}
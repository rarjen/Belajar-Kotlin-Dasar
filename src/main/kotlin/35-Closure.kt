fun main() {
    /*
    Closures
    - Closure adalah kemampuan sebuah function, lambda atau anonymous fun berinteraksi dengan data-data disekitarnya dalam scope yang sama
    - Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi
    - Enclosure sangat berbahaya, karena bisa merubah data milik tempat lain
    - Jarang digunakan (sebisa mungkin harus dihindari).
     */

    var counter: Int = 0;
    val lambdaIncrement: () -> Unit = {
        println("Increment $counter");
        counter++; //dapat mengakases data diluar fun
    };

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment $counter");
        counter++;
    }

    fun functionIncrement() {
        println("Function Increment $counter");
        counter++;
    }

    lambdaIncrement(); //Increment 0
    lambdaIncrement(); //Increment 1
    lambdaIncrement(); //Increment 2
    anonymousIncrement();
    anonymousIncrement();
    anonymousIncrement();
    functionIncrement();
    functionIncrement();
    functionIncrement();

}
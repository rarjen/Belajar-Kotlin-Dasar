fun main() {
    /*

    Operator perbandingan
    - >     -> Lebih dari
    - <     -> Kurang dari
    - >=    -> Lebih dari sama dengan
    - <=    -> Kurang dari sama dengan
    - ==    -> Sama dengan
    - !=    -> Tidak sama dengan

     */

    val a = 100;
    val b = 200;

    val result: Boolean = a > b;
    println(result); //false


    println("a" > "b"); //false karena a lebih dulu keluar
    println("a" == "b"); //false
    println("a" != "b"); //true
}
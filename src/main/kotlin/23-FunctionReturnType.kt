fun sum(a: Int, b: Int): Int {
    val total = a + b;
    return total
}

fun bagi (a: Int, b: Int): Int {
    if(b == 0){
        return 0;
    } else {
        val total = a / b;
        return total;
    }
}

fun main() {
    /*
    Function Return Type
    - Untuk memberitahu function mengembalikan data, kita harus menuliskan tipe data kembalian dari fun tersebut
    - Jk function tsb kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam fun nya kita harus mengembalikan data
    - Untuk mengembalikan data dari fun, kita bisa menggunakan kata kunci return, diikuti dengan datanya.
     */
    val result = sum (10, 10); //20
    println(result);

    println(sum(20, 19)); //39

    println(bagi(10,2)); //5
    println(bagi(10,0)); //0
}
fun main() {
    /*
    For Loops
    - Digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)
     */

    // For Loop pada array
    val names = arrayOf("Otniel", "Kevin", "Abiel");

    for (name in names) {
        println(name);
    };

    // For Loop pada range
    for (value in 0..100){
        println(value);
    }
    for (value in 100 downTo 0 step 5){
        println(value);
    }

    // Kombinasi array & range
    val ukuranNama = names.size - 1;
    for (i in 0..ukuranNama){
        println("Index ke $i: ${names.get(i)}");
    }
}
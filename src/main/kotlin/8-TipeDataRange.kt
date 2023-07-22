fun main() {
    /*
    Tipe Data Range

    - Kadang kita ingin membuat array berisi data yang angkanya berurutan
    - Membuat array dengan jumlah yg sedikit mungkin mudah, tapi bagaimana jika data yang berurutan sangat banyak, misal 1-1000
    - Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini.
    - Cara membuat range di kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali)
        -> 0..10: Range 0-10
        -> 1..100: Range 1-100
    - Bisa juga membuat urutan dengan kelipatan n
    - Tidak bisa diakses seperti pada array
    - Operasi pada range:
        * count()           -> mendapatkan total data di range
        * contains(value)   -> mengecek apakah ada value tsb
        * first -> mendapatkan nilai pertama
        * last -> mendapatkan nilai terakhir
        * step -> mendapatkan nilai tiap kenaikan
     */


    // range naik
    val range = 1..1000;
    
    println(range.count()); //1000
    println(range.contains(50)); //true
    println(range.contains(5000)); //false
    println(range.first); //1
    println(range.last); //1000
    println(range.step); //1


    // range turun
    val rangeDown = 1000 downTo 1;
    println(rangeDown.count()); //1000
    println(rangeDown.contains(50)); //true
    println(rangeDown.contains(5000)); //false
    println(rangeDown.first); //1000
    println(rangeDown.last); //1
    println(rangeDown.step); //-1


    // range naik dengan step
    val rangeStep = 0..100 step 5;
    println(rangeStep.count()); //21
    println(rangeStep.contains(50)); //true
    println(rangeStep.contains(5000)); //false
    println(rangeStep.first); //0
    println(rangeStep.last); //95
    println(rangeStep.step); //5


    // range turun dengan step
    val rangeStepDown = 100 downTo 0 step 5;
    println(rangeStepDown.count()); //21
    println(rangeStepDown.contains(50)); //true
    println(rangeStepDown.contains(5000)); //false
    println(rangeStepDown.first); //100
    println(rangeStepDown.last); //0
    println(rangeStepDown.step); //-5

}
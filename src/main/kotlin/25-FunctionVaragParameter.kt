fun finalValue(name: String, vararg values: Int){
    var total = 0.0;
    for (value in values){
        total += value;
    };
    total /= values.size //mean
    println("Final value $name = $total");
};

fun names(vararg names: String){
    for (name in names){
        println(name);
    };
};

fun totalSum(values: Array<Int>): Int { // function yang tidak menggunakan varargs harus mengirim value tipe data array terlebih dahulu
    var total = 0;
    for (value in values){
        total += value;
    }
    return total;
}

fun main() {
    /*
    Function Varargs (Variable Argument) Parameter
    - Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
    - Varargs artinya datanya bisa menerima lebih dari 1 input, atau anggap saja semacam array.
    - Apa bedanya dengan param biasa dengan tipe data Array?
        - Jika param tipe array, kita wajib membuat array terlabih dahulu sebelum mengirimkan ke fun.
        - Jk param menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma.
     */

    finalValue("Rata-rata", 10,20,30,40,50);
    finalValue("Rata-rata2");

    names("Otniel", "Kevin", "Abiel");


    val value = arrayOf(10, 10, 10, 10); // array yang akan dimasukkan
    val result = totalSum(value);
    println(result); //40
}
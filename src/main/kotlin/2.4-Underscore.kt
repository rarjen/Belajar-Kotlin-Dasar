fun main() {

    // Underscore in number (hanya digunakan untuk memisahkan angka agar dapat dibaca)
    // underscore tidak akan ditampilkan pada terminal
    var age: Byte = 3_0;
    var height: Int = 1_7_0;
    var distance: Short = 2_000;
    var balance: Long = 100_000_000L;

    println(age)
    println(height)
    println(distance)
    println(balance)

    // Example
    var myMoney: Long = 9_000_000_000L;
    println("Uangku miliaran berjumlah " + myMoney);
}
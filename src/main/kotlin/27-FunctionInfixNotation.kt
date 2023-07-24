infix fun String.to(type: String): String {
    if (type == "UP"){
       return this.toUpperCase(); // .toUpperCase()
    } else {
        return this.toLowerCase() // .toLowerCase
    }
}

infix fun Int.sum(value: Int): Int{
    val total = this + value;
    return total;
}

fun main() {
    /*
    Fun Infix Notation
    - Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
    - Hampir semua operasi matematika adalah infix notation
    - Di kotlin, kita bisa membuat function infix notation juga
    = Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)

    Syarat Fun Infix Notation
    - Harus sebagai function member (akan dibahas di OOP) atau function extension
    - Harus memiliki 1 parameter
    - Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
     */

    val result = "Kevin" to "UP";
    println(result);

    val result2 = 2 sum 3;
    println(result2); //5
}
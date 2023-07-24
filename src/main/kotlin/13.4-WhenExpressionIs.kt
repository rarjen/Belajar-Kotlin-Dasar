fun main() {
    // Digunakan untuk mengecek tipe data
    val name = "Kevin";
    when (name) {
        is String -> println("This is string");
        !is String -> println("This is not string");
    }
}
fun main() {
    val finalExam = "A";
    val passValues: Array<String> = arrayOf("A", "B", "C");
    when (finalExam) {
        in passValues -> {
            println("Pass")
        }; // melakukan pengecekan data pada array
        !in passValues -> {
            println("Try Again")
        };
    }
}
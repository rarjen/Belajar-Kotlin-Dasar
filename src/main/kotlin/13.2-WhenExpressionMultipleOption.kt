fun main() {
    val finalExam = "C";
    when (finalExam) {
        "A", "B", "C" -> {
            println("Pass");
        };
        else -> {
            println("Not Pass");
            println("Try Again Next Year");
        }
    }
}
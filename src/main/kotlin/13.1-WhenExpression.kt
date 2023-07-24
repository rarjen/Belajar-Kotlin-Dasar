fun main() {
    /*
    When Expression (Switch Expression)
    - Sama seperti If Expression namun lebih simple
    - Biasanya digunakan untuk melakukan pengecekan ke kondisi dalam satu variable
     */

    val finalExam = "C";

    when (finalExam) {
        "A" -> println("Amazing") // bila 1 baris bisa gini
        "B" -> {
            println("Good");
            println("You're good");
        } // bila ada operasi lebih dari 1 baris
        "C" -> {
            println("Not bad");
        }
        "D" -> println("Bad");
        "E" -> println("Try again next year");
        else -> println("Ups");
    };


}
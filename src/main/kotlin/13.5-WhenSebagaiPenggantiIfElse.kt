fun main() {
    /*
    When Sebagai Pengganti If Else
    - Selain pengecekan terhadap variable.
    - When juga dapat digunakan sebagai pengganti if else.
    - Untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when.
    - lebih simple dan tidak perlu menampilkan else if lagi.
     */

    val examValue = 52;
    when {
        examValue > 80 -> println("Good Job");
        examValue > 60 -> println("Not Bad");
        examValue > 50 -> println("Bad");
        else -> println("Try again next year");
    };
}
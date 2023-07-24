fun main() {
    /*
    Operasi Boolean:
    - && -> Dan
    - || -> Atau
    - !  -> Kebalikan (negasi)
     */

    val finalExam = 80;
    val attendant = 75;
    val nilaiExtra = 72;

    val passFinalExam = finalExam > 75;
    val passFinalAttendant = attendant > 74;
    val passFinalExtra = nilaiExtra > 70;

    val lulus = passFinalExam && passFinalAttendant && passFinalExtra;
    println(lulus); //true karena keduanya memenuhi


}
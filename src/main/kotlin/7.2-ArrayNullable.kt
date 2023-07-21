fun main() {
    /*
    Array Nullable
    - Secara standard data di Array tidak boleh null di Kotlin
    - Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)
     */

    val names: Array<String?> = arrayOfNulls(5);
    names[0] = "Otniel";
    names[1] = null;
    names[2] = "Abiel";
    names[3] = null;
    names[4] = "Leinto777";


    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])

    println("Panjang array adalah: ${names.size}")
}
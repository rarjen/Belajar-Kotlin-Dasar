fun main() {
    /*
    Tipe Data Array
    - Hanya dapat menampung tipe data yang sama (tidak seperti pada JS)
    - Tipe data array Kotlin di representasikan dengan kata kunci Array


    Operasi Array
    - size          -> utk mendapatkan panjang array
    - get(index)    -> utk mendapatkan data di posisi index
    - [index]       -> utk mendapatkan data di posisi index
    - set(index, value) -> mengubah data (value) di posisi index
    - [index] = value   -> mengubah data (value) di posisi index
     */

    val members: Array<String> = arrayOf("Otniel", "Kevin", "Abiel");

    // melakukan akses ke array
    println(members[0]); //Otniel

    // menimpa data array
    members.set(0, "Leinto");
    members[1] = "Nivek"
    println(members[0]); //Leinto
    println(members[1]); //Nivek


    val values: Array<Byte> = arrayOf(100, 90, 95);
    println(values[0]);
    println(values[1]);
    println(values[2]);
}
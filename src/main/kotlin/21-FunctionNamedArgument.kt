fun fullName(firstName: String, middleName: String, lastName:String) {
    println("Hello $firstName $middleName $lastName");
};

fun main() {
    /*
    Function Named Argument
    - Kadang ada function yang paramaternya banyak sekali
    - Hal ini sangat menyulitkan saat memanggil function tersebut, kita harus benar-benar tahu urutan parameter di function tsb
    - Untungnya kotlin memiliki fitur yang namanya Named Argument
    - Named Argument adl fitur dimana kita bisa menyebutkan nama param saat memanggil function, dg demikian kita tidak wajib tahu posisi tiap parameter
     */

    fullName(firstName = "Otniel", lastName = "Abiel", middleName = "Kevin")
    fullName("Otniel", "Kevin", "Abiel");
};
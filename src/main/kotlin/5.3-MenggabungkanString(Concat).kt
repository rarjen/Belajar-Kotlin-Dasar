fun main() {
    /*
    Menggabungkan String
    - Menggunakan tanda (+)
     */

    var firstName:String = "Otniel";
    var middleName:String = "Kevin";
    var lastName:String = "Abiel";

    var fullName:String = firstName + " " + middleName + " " + lastName;

    println(fullName);

    // Menggabungkan kata dengan + akan mendapatkan warning.
    // Sehingga ada cara lain yaitu menggunakan String Template
    // Tanda $ digunakan untuk template expresi sederhana
    // Tanda ${isi expresi} digunakan untuk template expresi yang kompleks

    var kodeProdi:String = "A11";
    var kodeTahun:String = "2020";
    var kodeNim:String = "13015";

    var nimMhs:String = "$kodeProdi.$kodeTahun.$kodeNim";
    println(nimMhs);

    var panjangNimMhs:String = "Panjang $nimMhs, adalah sebanyak ${nimMhs.length}";
    println(panjangNimMhs)
}
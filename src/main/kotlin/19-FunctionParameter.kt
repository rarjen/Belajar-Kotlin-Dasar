fun sayHello (firstName: String, lastName: String?, age: Int){
    if (lastName == null) {
        println("Hello $firstName, your age is $age you was born in ${2023-age}");
    } else {
        println("Hello $firstName $lastName, your age is $age you was born in ${2023-age}");
    }
}

fun main() {
    // parameter by default adalah val, sehingga tidak dapat diubah-ubah
    // semua parameter wajib dimasukkan
    // pada param nullable (String?), value harus tetap dikirim dan diberi value null
    sayHello("Otniel", "Kevin", 22);
    sayHello("Budi", null, 21);
}

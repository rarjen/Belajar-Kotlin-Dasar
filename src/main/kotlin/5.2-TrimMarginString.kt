fun main() {
    var data: String = """
        Otniel Kevin Abiel
        A11.2020.13015
    """.trimIndent(); // Menghapus indent sehingga rata ke kiri

    var address1: String = """
        |Jalan Imam Bonjol,
        |Semarang
    """.trimMargin(); // Menghapus margin dan menggabungkan string dan menghapus Pipeline symbol

    var address2: String = """
        >Kota Semarang
        >Jawa Tengah
        >Indonesia
    """.trimMargin(">") // akan menghapus karakter ">" ( ">" menggantikan simbol "pipeline" sehingga harus di identifikasi prefix nya)


    println(address1);
    println(address2);
}
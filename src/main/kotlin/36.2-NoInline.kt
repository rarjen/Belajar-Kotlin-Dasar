inline fun helloNoinline(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}";
}

fun main() {
    /*
    NoInline
    - Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
    - Jika kita menambahkan 2 param lambda maka dua-dua nya akan di convert menadi inline.
    - Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan
      kata kunci noinline
     */

    println(helloNoinline({ "Otniel" }, { "Kevin" }));
}
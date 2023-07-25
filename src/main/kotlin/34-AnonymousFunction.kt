fun main() {
    /*
    Anonymous Function
    - Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
    - Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
    - Untuk hal ini, kita bisa menggunakan Anonymous Function
    - Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func
     */

    // High-order functions
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformed = transformer(name);
        return  "Hello $nameTransformed";
    };

    val anonymousUpper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups";
        }
        return value.toUpperCase();
    }

    println(hello("Kevin", anonymousUpper));
    println(hello("",anonymousUpper));

    //bisa juga seperti ini
    println(hello("SAYANG", fun(value: String): String {
        return value.toLowerCase();
    }))
}
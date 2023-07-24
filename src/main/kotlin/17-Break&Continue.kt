fun main() {
    /*
    Break & Continue
    - Break & Continue adalah kata kunci yang bisa digunakan dalam semua perulangan kotlin
    - Break digunakan untuk menghentikan seluruh prulangan
    - Continue digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke program selanjutnya
     */

    //Break
    var i = 0;
    while (true) {
        println("Break me!");
        i++;
        if(i > 10){
            break;
        }
    }


    //Continue
    for (i in 1..1000){
        if(i % 2 == 0) {
            continue;
        }
        println(i)
    }
}
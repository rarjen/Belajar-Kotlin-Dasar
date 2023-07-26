fun labelFuncion(){
    loopI@ for (i in 1..10){
        looopJ@ for(j in 1..10){
            println("$i x $j = ${i * j}")
        }
    }
}

fun labelBreak(){
    // Label at Break
    loopI@ for (i in 1..10){
        looopJ@ for(j in 1..10){
            println("$i x $j = ${i * j}")
            if (j == 10){
                break@loopI
            }
        }
    }
}

fun labelContinue(){
    // Label at Continue
    loopI@ for (i in 1..10){
        loopJ@ for(j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}


fun main() {
    /*
    Label
    - Label adalah penanda
    - Semua expression di Kotlin bisa ditandai dengan label
    - Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
     */

//    labelFuncion();

    /*
    Kegunaan Label -> Pada Break, Continue dan Return
    - Salah 1 kegunaan label adl, bisa diintegrasikan dengan break, continue dan return
    - Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun dengan menggunakan label,
      kita bisa menentukan ke label mana kode akan berhenti.
     */

//    labelBreak();

//    labelContinue()

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name);

    test("Kevin") test@ {
        if(it == ""){
            return@test
        } else {
            println("Kevin");
        }
    }

    // LABEL JARANG DIGUNAKAN OLEH PAK EKO
    // Tidak direkomendasikan untuk digunakan
}
fun main() {
    // Saat kita membuat lambda dan hanya memiliki 1 param, maka kita tidak harus mendeklarasikan variable nya di lambda tsb

    val lambdaName: (String) -> String = {
        "Hello ${it.toUpperCase()}";
    }
    println(lambdaName("kevin"));

    val double: (Int) -> Int = {
        val result = it * 2;
        result
    }
    println(double(100));

    val pangkat: (Int) -> Int = {
        val result = it * it;
        result
    }
    println(pangkat(3));
}
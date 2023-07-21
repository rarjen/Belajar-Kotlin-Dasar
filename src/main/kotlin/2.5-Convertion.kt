fun main() {
    var number: Int = 100;

    //Conversion
    var byte: Byte = number.toByte();
    var short: Short = number.toShort();
    var int: Int = number.toInt();
    var long: Long = number.toLong();
    var float: Float = number.toFloat();
    var double: Double = number.toDouble();

    println(byte);
    println(short);
    println(int);
    println(long);
    println(float);
    println(double);

    // example
    var priceLong: Long = 9_000_000_000L;
    var priceInt: Int = priceLong.toInt();

    println(priceInt); // Output 410065408 (Karena number overflow sehingga akan mereset lagi dari negatif dan naik terus hingga sebelum batas)
}
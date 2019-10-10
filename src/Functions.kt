fun addNumber(x: Double = 10.0, y: Double = 0.0): Double {
    val sum = x + y;
    return sum;
}

fun displayInfo(vararg names: String) {
    for (name in names) {
        println(name);
    }
}

fun main() {
    println(addNumber(y = 20.0));
    displayInfo(*arrayOf("Jena", "Selvesan", "James"))
}
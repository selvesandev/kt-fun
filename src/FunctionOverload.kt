fun add(a: Int, b: Int): Int {
    return a + b;
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}


fun add(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d;
}

fun main() {
    println(add(2, 2, 2, 2)) // calling the 4th function
    println(add(2, 2)) // calling the 1st function
}
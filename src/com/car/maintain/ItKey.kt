package com.car.maintain

class ItKey {
    fun reverseString(str: String, myFunc: (String) -> String) {
        println(myFunc(str));
    }
}

fun main() {
    val obj = ItKey();
    obj.reverseString("Hello world") { it.reversed() };
    // it is the name of the single parameter inside a lambda expression
    // it is only applicable if you have only once parameter.
}
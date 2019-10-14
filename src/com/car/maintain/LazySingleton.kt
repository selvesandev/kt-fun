package com.car.maintain

class LazySingleton {
    var name: String? = null;

    private constructor(){
        println("You instantiated the class")
    }

    companion object {
        val instance: LazySingleton by lazy { LazySingleton() }
    }
}

fun main() {

    val ob1 = LazySingleton.instance;
    ob1.name = "Tom";

    val ob2 = LazySingleton.instance;
    println(ob2.name) // prints tom

}
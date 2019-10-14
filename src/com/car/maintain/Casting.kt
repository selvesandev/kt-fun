package com.car.maintain

open class Casting {
    fun check() {
        println("Hello from Casting class")
    }

    fun hey() {
        println("Hey from Casting class")
    }
}

class ExampleClass : Casting() {
    fun one() {
        println("Hello from one")
    }

    fun two() {
        println("Hello from two")
    }
}

fun main() {
    val obj = ExampleClass() as Casting;
    obj.check();

}
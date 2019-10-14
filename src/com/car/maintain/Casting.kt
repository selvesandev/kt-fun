package com.car.maintain

class Casting {
    fun check() {
        println("Hello from Casting class")
    }

    fun hey() {
        println("Hey from Casting class")
    }
}

class ExampleClass {

    fun check() {
        println("From Example")
    }


}

fun main() {
    val obj = ExampleClass() as Casting
    obj.check();

}
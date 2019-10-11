package com.car.maintain

open class Animal() {
    open var color: String? = null;

    constructor(color: String) : this() {
        print("Animal $color");
    }
}

class Dog : Animal {
    var breed: String? = null;

    constructor(color: String) : super(color) {
        println("DOG $color")
    }

}

class Cat : Animal("Red") {
    var age: Int = 0;
    fun meow() {
        println("Meow")
    }
}


fun main() {
    val dog = Dog("Black");
}


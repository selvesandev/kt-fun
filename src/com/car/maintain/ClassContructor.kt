package com.car.maintain

class ClassConstructor(var age: Int) {
    var name: String? = null;

    init {
        println(this.name + " here" + this.age.toString()) // here the name will be null
    }

    constructor(age: Int, name: String) : this(age) {
        this.name = name;
    }


    fun getOutput(): String {
        return "Hello $name you are $age years old";
    }
}

fun main() {
    val obj = ClassConstructor(20);//initializing the class with the primary constructor
    println(obj.age)
    val obj2 = ClassConstructor(20, "Selvesan");//initializing the class with secondary constructor.
    println(obj2.age.toString() + ' ' + obj2.name);

//    println(obj.getOutput())
//    println(obj2.getOutput())
}


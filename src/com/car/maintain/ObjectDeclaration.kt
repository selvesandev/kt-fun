package com.car.maintain

object Customer : CheckIn() {
    var id: Int = 1;//behaves like a static variable.

    fun registerCustomer() {
        //behaves like a static method.
        println("Customer registered #id " + this.id)

    }
}

open class CheckIn {
    init {
        println("Initialized")
    }
    fun mySuperClass(){
        println("From my super class");
    }
}


fun main() {
    Customer.id = 2345;
    Customer.registerCustomer(); //no need to declare a object.
    Customer.mySuperClass();
}
package com.car.maintain

class MyCompClass {
    companion object CustomerData {
        var count: Int = 100

        fun printCount() {
            print("Count is $count");
        }
    }
}

fun main() {
    MyCompClass.printCount();
}
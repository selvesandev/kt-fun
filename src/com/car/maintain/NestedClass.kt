package com.car.maintain

class NestedClass {
    val name: String = "Selvesan"

    inner class ActualNestedClass {

        fun insideTheNest() {
            //this name property is only accessible once you declare the nested class with inner keyword
            println(name);
        }
    }
}

fun main() {
    val obj = NestedClass();
    val nestObj = obj.ActualNestedClass();

    nestObj.insideTheNest();
}
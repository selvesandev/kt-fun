package com.car.maintain

class WithApply {
    var name: String? = null;
    var age: Int = 0;
    var canSing: Boolean? = null;

    fun myFunc() {
        println(name)
    }
}

fun main() {
    val obj = WithApply();
    with(obj) {
        name = "Selvesan"
        age = 20
        canSing = true
        myFunc();
    }

    obj.apply {
        name = "James"
    }.myFunc();

    println(obj.name);
}
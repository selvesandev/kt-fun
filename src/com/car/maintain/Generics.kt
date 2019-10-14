package com.car.maintain


//Here "T" simply refers to what the type is passed to this class object will be of that type.

class UserAdmin<T>(credit: T) {
    init {
        println(credit)
    }
}


fun <T> sort(data: T) where T : Number, T : Comparable<T> {
    println(data)
}

fun main() {
    var uaInt = UserAdmin<Int>(20);
    var uaString = UserAdmin<String>("Selvesan");

    sort<Int>(20);
    sort<Float>(20.33f);
}
package com.car.maintain


abstract class PersonClass {
    abstract val color: String;
    abstract fun getHeight();
}


class Nepali(override val color: String) : PersonClass() {

    override fun getHeight() {

    }

}

fun main() {
    val np = Nepali("White");
}
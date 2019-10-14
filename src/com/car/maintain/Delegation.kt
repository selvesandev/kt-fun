package com.car.maintain

interface BirdInterface {
    fun flyAndFindFood();
}

class Eagle() : BirdInterface {
    override fun flyAndFindFood() {
        println("I am Eagle and I Fly and Find Food");
    }
}

class Raven(b: BirdInterface) : BirdInterface by b {

}


fun main() {
    val obj = Eagle();
    obj.flyAndFindFood();


    val ravenObj = Raven(obj);
    ravenObj.flyAndFindFood();

}
package com.car.maintain


class ABC(var name: String) {

}

fun ABC.getYourName(): String {
    //this is an extension function
    //extension function cannot access to private or protected property
    //extension can have only this not super.
    return this.name;
}

fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0;

    for (item in this) {
        if (item > maxNumber) {
            maxNumber = item;
        }
    }
    return maxNumber;
}


fun main() {
    val objA = ABC("Selvesan");
    println(objA.getYourName())

    val listOfElement = ArrayList<Int>();
    listOfElement.add(1);
    listOfElement.add(5);
    listOfElement.add(2);

    println(listOfElement.findMax());
}
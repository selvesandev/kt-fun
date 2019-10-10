package com.car.maintain

class Car(val type: String, val model: Int, val price: Double, val mileage: Int, val owner: String) {
    init {

    }

    fun getCarPrice(): Double {
        return price;
    }
}

fun main() {
    val car = Car("BMW", 2015, 4500.12, 30, "Selvesan");
    println(car.mileage.toString() + " " + car.model)
    println(car.getCarPrice())

    //car list
    val listOfCars = arrayListOf<Car>();
    listOfCars.add(Car("BMW", 2015, 4500.12, 30, "Selvesan"))
    listOfCars.add(Car("KIA", 2017, 5600.12, 20, "James"))

    for (carObj in listOfCars) {
        println(carObj.getCarPrice());
    }
}
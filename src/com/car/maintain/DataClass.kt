package com.car.maintain

data class PersonData(val name: String, val age: Int, val gender: String);

class SuperClass(val name: String, val age: Int) {

}

fun main() {
    val person = PersonData("Selvesan", 20, "Male");
    println(person.name + ' ' + person.age)

    val sp = SuperClass("James", 20);
    val sp2 = SuperClass("James", 20);
    //this won't be equal
    if (sp == sp2) {
        println("Equal")
    }else{
        println("Not equal");
    }
}
package com.car.maintain

import java.util.*
import kotlin.collections.ArrayList


//Here the Int in Comparable is the data type returned by
class CompareA(val name: String, val age: Int) : Comparable<CompareA> {
    override fun compareTo(other: CompareA): Int {
        return this.age - other.age;
    }
}


//class CompareB(val b: Int) : Comparable<CompareA> {
//    override fun compareTo(other: CompareA): Int {
//        return this.b - other.a;
//    }
//}


fun main() {
    val listOfObj = ArrayList<CompareA>();
    listOfObj.add(CompareA("Ram", 30))
    listOfObj.add(CompareA("Shyam", 20))
    listOfObj.add(CompareA("Gopal", 50))

    //this sort will not be possible if there was no comparable implemented.
    listOfObj.sort();
    for (user in listOfObj) {
        println("${user.name}, ${user.age}")
    }

}
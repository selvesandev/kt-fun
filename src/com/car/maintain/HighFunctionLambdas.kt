package com.car.maintain

fun main() {
    val obj = HighFunctionLambdas();
    obj.addNumbers(2, 2, object : MyFunctionInterface {
        override fun printSum(sum: Int) {
            println(sum);
        }
    });

    val myLambda: (Int) -> Unit = { s: Int -> println(s) };
    //Unit is a void data type in kotlin since the lambda does not return anything.
    myLambda(2);


    obj.addNumberWithLambda(2, 2) { s: Int -> println(s) }


    var result = 0;
    val myLmb = { x: Int, y: Int -> result = x + y }
    myLmb(2, 2);
    println(result)
}


interface MyFunctionInterface {
    fun printSum(sum: Int);
}

class HighFunctionLambdas {

    fun addNumbers(a: Int, b: Int, prInt: MyFunctionInterface) {
        val sum: Int = a + b;
        prInt.printSum(sum);
    }

    fun addNumberWithLambda(a: Int, b: Int, printLmb: (Int) -> Unit) {
        val sum = a + b;
        printLmb(sum);
    }
}
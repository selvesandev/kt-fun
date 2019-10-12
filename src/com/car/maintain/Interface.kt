package com.car.maintain

interface MyBtnClickListener {

    var name: String

    fun onTouch()

    fun onclick() {
        //you can override this function or not this is totally your choice.
        println("You called onClick from interface...")
    }
}

class Button(override var name: String) : MyBtnClickListener {

    override fun onTouch() {
        println("Button was touched")
    }

}


fun main() {

    val myBtn = Button("Selvesan");
    myBtn.onTouch();
    myBtn.onclick();
}
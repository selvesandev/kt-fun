package com.car.maintain

interface CreditCard {
    val cardNumber: String;
    fun score(age: Int);
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        println("Master Card $age card no: $cardNumber")
    }

    fun printCheck() {
        println("Hey this is from mastercard")
    }
}

class Visa(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        println("Visa Card $age card no: $cardNumber");
    }
}


class PayPal(client: CreditCard) : CreditCard by client {


}


fun main() {
    val masterCardObj = MasterCard("1234");
    masterCardObj.score(20);

    val visObj = Visa("1234567");
    visObj.score(20);


    //now calling the function with a delegation
    val payPalObj = PayPal(visObj);//delegated a Visa
    payPalObj.score(32);//Visa Card 32 card no: 1234567


    val payPalObj2 = PayPal(masterCardObj);//delegated a Visa
    payPalObj2.score(54);//Master Card 54 card no: 1234



}
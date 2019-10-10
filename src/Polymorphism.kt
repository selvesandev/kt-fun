fun show(cardId: Int) {
    println("Card ID $cardId")
}

fun show(cardName: String) {
    println("Name $cardName")
}

fun main() {
    show("Selvesan");//calling the 2nd function
    show(2345);//calling the 1st function.
}
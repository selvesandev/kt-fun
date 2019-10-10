fun main() {
    val food: Int = readLine()!!.toInt()

//    val footType: String =
//        when (food) {
//            1 -> "Sandwich"
//            2 -> "Pizza"
//            else -> "Burger"
//        }

    val footType: String = if (food == 1) "Sandwich" else if (food == 2) "Pizza" else "Burger"
    print("You got $footType")


}
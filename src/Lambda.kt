val sum = { num1: Int, num2: Int -> (num1 + num2) }

fun main() {
    println(sum(2, 2))

    val listOfNum = arrayOf(1, 2, 3, 4)
    listOfNum.forEach { number ->
        println(number)
        println(number + 2)
    }
}
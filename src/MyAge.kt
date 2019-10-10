import java.util.*

fun main() {
    println("Enter your year of birth")
    val yearOfBirth: Int = readLine()!!.toInt();

    val yearInDevice: Int = Calendar.getInstance().get(Calendar.YEAR)


    println("You are ${yearInDevice - yearOfBirth}")
}
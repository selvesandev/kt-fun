fun main() {
    println("Enter name")
    val name: String = readLine()!!.toString()

    println("Enter age")
    val age: Int = readLine()!!.toInt()

    println("Enter your GPA")
    val gpa: Double = readLine()!!.toDouble()
//    val department: String
//    department = "Software Engineer"


    println("I am $name and i am $age years old, scored $gpa");
}
fun main() {
    val name = "Selvesan"
    val age = 20

    val department: String
    department = "Software Engineer"

    var company: String?
    company = null
    company = "Sahakarya tech";
    println("My name is $name an $department and i am $age years")
    println("I work at ${company!!}")
}
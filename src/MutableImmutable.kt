fun main() {
//mutable.
    val myList = listOf<String>("Jena", "Lava");
    val listMutable = mutableListOf<String>("Check");
    listMutable[1] = "Check";


    val myMap = mapOf(1 to "ram", 2 to "Shyam");
    val myMapMutable = mutableMapOf("a" to "Hari", "b" to "Gopal")
    myMapMutable["c"]="Chameli"
}
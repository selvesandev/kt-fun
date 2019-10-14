fun main() {
    val myMap = mapOf<String, Int>("name" to 20);
    for (key in myMap.keys) {
        println(myMap[key]) // myMap.get("name")
    }

    val myMuMap = HashMap<String, String>();
}
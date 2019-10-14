fun main() {
    val list = listOf<String>("Yogi", "Selvesan");

    for (element in list) {
        println(element)
    }

    for (index in list.indices) {
        println(index)
    }

    println(list.get(0))

    val mutableList = mutableListOf<String>("Ram")
    mutableList.add("James")
    mutableList.add("Shyam")
}
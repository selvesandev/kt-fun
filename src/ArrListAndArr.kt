fun main() {
//    val petList = ArrayList<String>()
    val petList = arrayListOf<String>()

    petList.add("James")
    petList.add("Cat")
    petList.add("Dog")

    for (pet:String in petList) {
        println(pet);
    }

}
fun main() {
    val petList = arrayListOf<String>("Tommy", "Hunter", "Goldy");
    petList[0] = "Check"//value can be updated.
    println(petList);

    val newPetList: Array<String> = Array(3) { "" }
    newPetList[0] = "Tommy"
    newPetList[1] = "Hunter"
    newPetList[2] = "Goldy"
//    newPetList[3] = "Check"

    println(newPetList)

    for (i in 0..2) {
        println(newPetList[i])
    }


}
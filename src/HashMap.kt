fun main() {
    val listOfUsers = HashMap<String, String>();
    val listOfUsersKt = hashMapOf<String, String>();
    listOfUsers["name"] = "Selvesan";
    listOfUsers["age"] = "James"

    println(listOfUsers);
    println(listOfUsers["age"])

    for (key in listOfUsers.keys) {
        println(listOfUsers[key])
    }
}
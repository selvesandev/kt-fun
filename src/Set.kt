fun main() {

    val mySet = setOf<Int>(2, 3, 4, 5, 9, 8, 8, 34, 5); //immutable read only.

    for (element in mySet) {
        println(element)
    }


    val myHashSet = hashSetOf<Int>(1,23, 2, 3, 4, 5, 6, 7);

    for (element in myHashSet) {
        print(element.toString() + ", ")
    }

}
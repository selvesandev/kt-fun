fun main() {
//    for (i in 1..5) {
//        println(i)
//    }
//
//    //even numbers
//    for (i in 0..100 step 2) {
//        println(i)
//    }
//

    x@ for (i in 10 downTo 0 step 2) {
//        println(i)
        for (j in 10 downTo 0 step 2) {
            println(j)
            if (j == 6) {
                break@x
            }
        }
    }

}
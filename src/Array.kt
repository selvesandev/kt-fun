fun main() {
    var myArr = Array<Int>(5) { 0 }
    myArr[1] = 34;
    for (element in myArr) {
        println(element)
    }

    for (index in myArr.indices) {
        println(index)
    }
}
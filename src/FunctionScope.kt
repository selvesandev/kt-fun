var name: String? = null;

fun showInfo() {
    name = "Welcome $name";
    print(name); // prints "Welcome selvesan"
}

fun main() {
    name = "Selvesan"
    showInfo()

}
fun main() {
    val message = "Welcome to kotlin"
    println(message[0].toLowerCase())
    println(message[0].toUpperCase())
    val parts: List<String> = message.split(' ')

    message.contains("Welcome") // true

//    println(message[0].trim)
}
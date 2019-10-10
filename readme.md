# KOTLIN FUNDAMENTALS.

### Data type.

```
val str = "Hello you there?"; // no need to define datatype when the value is initialized at the same line
```

```
val str: String;
str = "Hello you there?"; // datatype required when the value is initialized later.
```

**val is readonly**
```
    val name = "Selvesan";
    name ="James"; //Fails
    
    var name = "Selvesan";
        name ="James"; //Pass
```

**placeholder**
```
    val name = "Selvesan";
    val age = 20;
    println("My name is $name and i am $age years old"); // use $varName to output the value inside a string.
```

**start a variable with null**
```
    val company: String? //use ? when declaring
    company = null
    
    println("I work at ${company!!}") // use !! when printing. // will throw an error

```

##### Input Data.
```
    val name: String = readLine()!!.toString() //input name which should not be null and convert it to string since the variable only excepts string.
```

##### Comments.
Comments can be `//` or `/* .... */`


### Logical Condition

```
    print(age > 19 && age < 50);
    print(age in 17..50) // Use range for these type of comparison.
```

**when Kotlin's Switch**
```
val food: Int = readLine()!!.toInt()

    when (food) {
        1 -> {
            print("You got sandwich")
        }
        2 -> {
            print("You got pizza")
        }
        else -> {
            print("You got nothing")
        }
    }
```
**Expression (Ternary)**
```
    val footType: String =
        when (food) {
            1 -> "Sandwich"
            2 -> "Pizza"
            else -> "Burger"
        }
     
     //Or 
     
    val footType: String = if (food == 1) "Sandwich" else if (food == 2) "Pizza" else "Burger"   
        
```

### Loop

**Using ranges**
```
for (i in 1..5) {
        println(i)
    }

    //even numbers
    for (i in 0..100 step 2) {
        println(i)
    }


    for (i in 99 downTo 0 step 2) {
        println(i)
    }
    
    //loop until a given length
    val maxSize=5
    for(i in 0 until maxSize){
        //from 0 to 5
    }
```
**break and continue also works here.**

**special feature to break the outer loop**
```
x@ for (i in 10 downTo 0 step 2) {
        for (j in 10 downTo 0 step 2) {
            println(j)
            if (j == 6) {
                break@x
            }
        }
    }
    //here x@ is a name for the loop which can be given as any name.
```



### Array
Array can be declare as: Kotlin provide java way and kotlin way to define `array` and `hashmaps`  

Declare an array for `String` with the length of 3.
```
    val newPetList: Array<String> = Array(3) { "" }
    newPetList[0] = "Tommy"
    newPetList[1] = "Hunter"
    newPetList[2] = "Goldy"
```
Declare an array for `Int` with the length of 3.
```
    val newPetList: Array<Int> = Array(3) { 0 }
```

##### String Demo.
```
 val message = "Welcome to kotlin"
    println(message[0])
    
    
    val message = "Welcome to kotlin"
    println(message[0].toLowerCase())
    println(message[0].toUpperCase())
    val parts: List<String> = message.split(' ')

    message.contains("Welcome") // true

```


#### Array List.
Array list is a dynamic array any number of items can be added. But has the disadvantage of the array size being doubled.
`.add` method should be used to add an items.

```
val petList = arrayListOf<String>("Tommy", "Hunter", "Goldy");
petList[0] = "Check"//value can be updated.

```

```
    var petList = ArrayList<String>() // java way
    var petListAno = arrayListOf<String>() //kotlin way
    // both method can be used to declare

    petList.add("James")
    petList.add("Cat")
    petList.add("Dog")

    for (pet:String in petList) {
        println(pet);
    }
    
```

**NOTE: Array have fixed size while array list is dynamic and does not have fixed size.**

### Linked List
Use linked list whenever the size is important. Both array list and linked list are same working mechanism and syntax.

```
    val myLinkedList = LinkedList<String>();
    myLinkedList.add("Selvesan")
        
```


### Hash Map.
This is a simple array. Every element in the array has a `key` and a `value`.
```

    val listOfUsers = HashMap<String, String>(); // java way
    val listOfUsersKt = hashMapOf<String, String>(); // kotlin way
    
    listOfUsers["name"] = "Selvesan";
    listOfUsers["age"] = "James"

    println(listOfUsers);
    println(listOfUsers["age"])
```

```
    for (key in listOfUsers.keys) {
        println(listOfUsers[key])
    }
```

### Mutable and Immutable.
When something is mutable you can update and add more. vice versa for immutable you cannot add or update.
```
//mutable and immutable list
    val myList = listOf<String>("Jena", "Lava");
    val listMutable = mutableListOf<String>("Check");
    listMutable[1] = "Check";
```

```
    //mutable and immutable map.
    val myMap = mapOf(1 to "ram", 2 to "Shyam");
    val myMapMutable = mutableMapOf("a" to "Hari", "b" to "Gopal")
    myMapMutable["c"]="Chameli"
```
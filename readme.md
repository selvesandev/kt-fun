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

### Functions
```
//type notation is required in function.
fun addNumber(x: Double, y: Double): Double {
    val sum = x + y;
    return sum;
}

fun main() {
    println(addNumber(2.0, 2.6));
}
```

**Function Arguments**
You can pass argument value directly specifying the argument name.
```
fun addNumber(x: Double = 10.0, y: Double = 0.0): Double {
    val sum = x + y;
    return sum;
}

fun main() {
    println(addNumber(y = 20.0));
}
```

**vararg**
```
fun displayInfo(vararg names: String) {
    for (name in names) {
        println(name);
    }
}

fun main() {
    println(addNumber(y = 20.0));
    displayInfo(*arrayOf("Jena", "Selvesan", "James"))
}
```

#### Function Overload.
Function with a same name but different number of arguments.
```
fun add(a: Int, b: Int): Int {
    return a + b;
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}


fun add(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d;
}

fun main() {
    println(add(2, 2, 2, 2)) // calling the 4th function
    println(add(2, 2)) // calling the 1st function
}
```

#### Polymorphism
Function with a same name and with the same number of arguments but with a different data type argument.

```
fun show(cardId: Int) {
    println("Card ID $cardId")
}

fun show(cardName: String) {
    println("Name $cardName")
}

fun main() {
    show("Selvesan");//calling the 2nd function
    show(2345);//calling the 1st function.
}
```


### Scope
You cannot have identical function i.e. with a same definitions( having same name, datatype and argument) even in two different files under a same folder(or package).  
A variable declared inside a function or a statement is only available to that function.
```
    for (i in 1..4) {
        var x = i; // local available only inside for.
    }
    print(x); // x won't be available here.
```
  
**However you can define a global variable.**
```
var name: String? = null;

fun showInfo() {
    name = "Welcome $name";
    print(name); // prints "Welcome selvesan"
}

fun main() {
    name = "Selvesan"
    showInfo()
}
```


### Lambda.
Is a approach to write a function.

```
fun sum(num1: Int, num2: Int): Int {
    return (num1 + num2)
}

fun main() {
    println(sum(2, 2))
}   
```

**OR**

```
val sum = { num1: Int, num2: Int -> (num1 + num2) }

fun main() {
    println(sum(2, 2))
}
```
**Inbuilt Lambda**

```
val listOfNum = arrayOf(1, 2,    3, 4)
    listOfNum.forEach { number ->
        println(number)
        println(number + 2)
    }
```

## Object Oriented 
### Class
Create a `class` inside a package. Create a package inside your `src` folder `com.car.maintain`.

* The name of the class and file name should be same. `Car.kt` has a class `Car`
```
package com.car.maintain

class Car {
    
}
```

#### Init
Executed when instantiated.
```
package com.car.maintain

class Car {
    init {
        //fired automatically when a class is instantiated
        println("Instantiated Car..")
    }
}

fun main() {
    val car = Car();
}
```

#### Class with properties
```
class Car(val type: String, val model: Int, val price: Double, val mileage: Int, val owner: String) {

}

fun main() {
    val car = Car("BMW", 2015, 4500.12, 30, "Selvesan");
    print(car.mileage.toString() + " " + car.model)
}
```

### Class with Method
```
class Car(val type: String, val model: Int, val price: Double, val mileage: Int, val owner: String) {
    
    fun getCarPrice(): Double {
        return price;
        //property can be access by both this.price or price
    }
}



fun main() {
    val car = Car("BMW", 2015, 4500.12, 30, "Selvesan");
    println(car.getCarPrice())
}
```

### Array List of Class Type.

```
    val listOfCars = arrayListOf<Car>();
    listOfCars.add(Car("BMW", 2015, 4500.12, 30, "Selvesan"))
    listOfCars.add(Car("KIA", 2017, 5600.12, 20, "James"))

    for (carObj in listOfCars) {
        print(carObj.getCarPrice());
    }
```
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

##### lateinit
`lateinit` key is a way to tell the compiler that we won't let the variable to be null and initialized it somewhere in our code. So that we dont have to check the variable for null everytime we use it.

```
class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView;
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //giving it a value
        diceImage = findViewById(R.id.dice_image);
    }
    
}
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


## Collections

**Immutable**
* `listOf`, `mapOf`, `setOf`

**Mutable**
* `ArrayList`, `arrayListOf`, `mutableListOf` List
* `HashMap`, `hashMapOf`, `mutableMapOf` Maps
* `hashSetOf`, `mutableSetOf` Sets


### Array.
Mutable in nature but has fixed size we cannot change the size in future. Collection of values represented by index.

```
    var myArr = Array<Int>(5) { 0 }
    //initial value is inside the lampda function.
    val newPetList: Array<String> = Array(3) { "" }

    myArr[0]=10;
    
    newPetList[0] = "Tommy"
    newPetList[1] = "Hunter"
    newPetList[2] = "Goldy"

    
    //Loop to access the value of array
    for (element in myArr) {
            println(element)
    }
    
    //Loop to access the index of array
    for (index in myArr.indices) {
        println(index)
    }
    
         
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


### List.
Array has a fixed size so we cannot change it later this is a disadvantage.
```
var list = listOf<String>("Yogi", "Selvesan",....list goes on);
```
The above declared list is immutable therefore once declared we cannot add more values to it later.

```
list[1]="Check" // you cannot do this.
```

* Loop for list (List has also a sequential index)
```
    for(element in list){
        println(element)
    }
    
    
    for (index in list.indices) {
        println(index)
    }
```
* You can also access the value inside list by `println(list.get(0))`



### Mutable List
Use `mutableListOf` or `ArrayList` or `arrayListOf` to create your mutable list all of these are same.

Is mutable in nature and can be modified later and it has no fixed size. You can perform `add` or `remove` method

* Mutable list of function to perform on it `list.remove`, `list.add`,``

* `list[0]="ram"` is also valid.

* `list.add(1,"Shyam")` do this to replace the value at position 1.



### Map (Immutable)
Map is a data structure in a key value pair

```
    val myMap = mapOf<String, Int>("name" to 20);
    
    for (key in myMap.keys) {
        println(myMap[key]) // myMap.get("name")
    }
    
```
Access the map item by `myMap["key"]` or `myMap.get("key")`

### Mutable Map
Use `HashMap` or `hashMapOf` or `mutableMapOf`
 
```
    val myMuMap = HashMap<String, String>();
```    
Is mutable in nature we can perform `add` and `remove` and no fixed size is defined.

* `myMap.replace(23,"james")` or `myMap.put(23,"james")` to replace the value at key `23`



### Immutable Set

* Set Contains unique elements 
* HashSet also contains unique elements but the sequence is not guaranteed in output.

```
 val mySet = setOf<Int>(2, 3, 4, 5, 9, 8, 8, 34, 5); //immutable read only.

    for (element in mySet) {
        println(element)
    }

```

* Here the set will remove the `duplicate 8` from the set.


### Mutable Set
```
val mySet = mutableSetOf<Int>(2, 3, 4, 5, 9, 8, 8, 34, 5); //immutable read 
```
* `mySet.remove(2)` to remove value 2
* `mySet.add(2)` to add new item.


##### HashSet
Also contains the unique element but the sequence is not guaranteed in output as it is defined.
```
val myHashSet = hashSetOf<Int>(1,23, 2, 3, 4, 5, 6, 7);

    for (element in myHashSet) {
        print(element.toString() + ", ")
        
        //1, 2, 3, 4, 5, 6, 23, 7
        // here notice the data printed sequence is not as it is defined.
    }
    
```

## -------------
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

### Primary Constructor
In primary constructor the value can be passed to a class when it is initialized.
```
class TruckInheritance(type: String) {
    var type: String? = type;
}

val truck = TruckInheritance("BMW");
truck.type // error invalid code
```
You cannot access the property of a primary constructor after it is assigned to the class because it is simply a set of argument and not a class's property.  
Therefor to access the property of a `primary constructor` you will have to assign it to the local property with the help of `init` method.
 
```
class TruckInheritance(type: String) {
    var type: String? = type;
    init {
        //this.type = type;
        type=type;//both works  
    }
}

val truck = TruckInheritance("BMW");
truck.type // success
```

**NOTE** However there is a method by which you can access the class argument passed to the primary constructor like it's property by using the `var` or `val` keyword in the argument.
```
class TruckInheritance(val type: String){
    
}
val truck = TruckInheritance("BMW");
truck.type // success

```


### Secondary Constructor
Secondary constructor is declared as a function inside kotlin.  
You can have two different constructor in kotlin but they should have different set of arguments.
**Use the primary Constructor method if you have only once constructor in a class**

```
class ClassConstructor {
    var name: String? = null;
    var age: Int? = null;

    //constructor with 2 args
    constructor(name: String, age: Int) {
        this.name = name;
        this.age = age;
    }

    //constructor with 1 args
    constructor(name: String) {
        this.name = name;
    }

    fun getOutput(): String {
        return "Hello $name you are $age years old";
    }
}

fun main() {
    val obj = ClassConstructor("Selvesan", 20);//initializing the class with the 1st constructor
    val obj2 = ClassConstructor("Selvesan");//initializing the class with 2nd constructor.
}

```
You cannot declare the property inside a secondary constructor directly.
```
    //you cannot do this
    constructor(var age: Int){
    
    }
    //you can do this.
    constructor(age:Int){
    
    }
```
**NOTE** You can have both primary and secondary constructor at the same time but you will have to bind `this` keyword to the secondary constructor.
 
```
class ClassConstructor(var age: Int) {
    var name: String? = null;

    constructor(age: Int, name: String) : this(age) {
        this.name = name;
    }
}

//initializing the class with the primary constructor
val obj = ClassConstructor(20);
print(obj.age)

//initializing the class with secondary constructor.
val obj2 = ClassConstructor(20, "Selvesan");
println(obj2.age.toString() + ' ' + obj2.name);

```

**NOTE** The secondary constructor will be always be called after the `init {} ` block if there is any.


```
class ClassConstructor(var age: Int) {
    var name: String? = null;
    
    init {
        // here the name will be null
        println(this.name + " here" + this.age.toString()) 
    }


    constructor(age: Int, name: String) : this(age) {
        this.name = name;
    }
}

//initializing the class with the primary constructor
val obj = ClassConstructor(20);
print(obj.age)

//initializing the class with secondary constructor.
val obj2 = ClassConstructor(20, "Selvesan");
println(obj2.age.toString() + ' ' + obj2.name);

```


### Inheritance
By default classes are `public` and `final` and cannot he inherited therefore you will have to declare the class as `open` to inherit it.
```
open class Animal {
    var color: String? = null;
    
    fun eat() {

    }
}

class Dog : Animal() {
    var breed: String? = null;

    fun bark() {
    
    }
}

class Cat : Animal() {
    var age: Int = 0;
    
    fun meow() {

    }
}

```

### Overriding.
* Methods are also by default `public` and `final` therefore you will have to `open`  the method in order to `override` it.
* `override` keyword should be used to override the function

```

open class Animal {
    var color: String? = null;
    open fun eat() {
        println("Animal Eat");
    }
}

class Dog : Animal() {
    var breed: String? = null;

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        println("The dog is eating.");
    }
}
```
* You can call the parents method which has been overridden with the help of `super` keyword.

```
    override fun eat() {
        super<Animal>.eat();//parent Animal Class's method eat.
        println("The dog is eating.");
    }
```

* Property can also be overridden by `open` and `override`

```
open class Animal {
    open var color: String? = null;
}

class Dog : Animal() {
    override var color: String? = null;
}
```

### Overriding Constructor.

##### Primary
```
open class Animal(var color: String) {
    init {
        println("Animal $color")
    }
}

class Dog(color: String) : Animal(color) {
    init {
        println("Dog $color")
    }
}


val dog = Dog("Black");

```

##### Secondary.

```
open class Animal() {
    open var color: String? = null;

    constructor(color: String) : this() {
        print("Animal $color");
    }
}

class Dog : Animal {
    var breed: String? = null;

    constructor(color: String) : super(color) {
        println("DOG $color")
    }

}

val dog = Dog("Black");


```


### Visibility Modifiers
In kotlin everything is public by nature.

* When a class or method is defined as `private` it is visible to only the file.

```
private fun main() {
    //won't be visible to another file
}

private class Person {
    //won't be visible to another file    
}

```

* If a class or method is declared as `internal` then it will be declared only inside the `module`

* `protected` is not applicable to the top label class or method

```

//not allowed
protected fun main() {

}
//not allowed.
protected class Person {

}

```
* `private` property and method in a class will be visible only within the scope of the same class. 
* `protected` property and method in a class will be visible to child class but won't be available in a object. 
* `internal` property and method in a class will be visible to child class and also inside a object within a same module. 
  
  
### Class Extensions
A Extension is a method that is defined outside the class but can act as a class's method.

* Extension function cannot access to private or protected property
* Extension can have only this not super.

```

class ABC(var name: String) {

}

fun ABC.getYourName(): String {
    return this.name;
}


val objA = ABC("Selvesan");
println(objA.getYourName())
```
**Extension Use Case** Adding extension to `kotlin's` inbuilt class `ArrayList`.

```
fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0;

    for (item in this) {
        if (item > maxNumber) {
            maxNumber = item;
        }
    }
    return maxNumber;
}


val listOfElement = ArrayList<Int>();
listOfElement.add(1);
listOfElement.add(5);
listOfElement.add(2);

println(listOfElement.findMax());
```


### Data Class
The purpose of the data class is to only deal with the data not the object.

```
data class PersonData(val name: String, val age: Int, val gender: String);

val person = PersonData("Selvesan", 20, "Male");
println(person.name + ' ' + person.age)

``` 

```
class SuperClass(val name: String, val age: Int) {

}


val sp = SuperClass("James", 20);
val sp2 = SuperClass("James", 20);
//this won't be equal as they are two different references.
if (sp == sp2) {
    println("Equal")
}else{
    println("Not equal");
}

// However this comparison will print equal in case of dataclass.
```


### Interface.

* Interface is not a class. It is something like a listener eg: onclick of btn something should happen. On android if you want to do something on a click of a button.

* You cannot instantiate a interface just like your abstract class.

* Interface can contain only abstract property but can contain both abstract and normal method.

* Whatever you define inside a interface is by default `abstract` and `open` in nature and should not contain a initial property should always be empty declaration.

* In case of interface nothing is final everything is open in nature there you cannot declare a final property or method.

* The abstract method and property should be overridden by the class that inherits it.

```
interface MyBtnClickListener {

    var name: String

    fun onTouch()

    fun onclick() {
        //you can override this function or not this is totally your choice.
        println("You called onClick from interface...")
    }
}

class Button(override var name: String) : MyBtnClickListener {

    override fun onTouch() {
        println("Button was touched")
    }

}


fun main() {

    val myBtn = Button("Selvesan");
    myBtn.onTouch();
    myBtn.onclick();
}
```
<<<<<<< HEAD


### Abstract Classes, Methods and Property.

* Abstract Method and property can be declared only inside a abstract class.

* A Abstract Method doest not have a body in it's definition.

* A Abstract Method or Property should be overridden by a child class.
 
* Abstract Method and Property are open by default.s

* Abstract Class cannot be instantiated.

```
abstract class PersonClass {
    abstract val color: String;
    abstract fun getHeight();
}


class Nepali(override val color: String) : PersonClass() {
    override fun getHeight() {
    }
}

val np = Nepali("White");

```


### Object Class Declaration or Singletons.
In Kotlin we cannot declare `static` variable and methods. Declare `object` which creates a singleton object when program runs.

```
object Customer {
    var id: Int = 1;//behaves like a static variable.

    fun registerCustomer() {
        //behaves like a static method.
        println("Customer registered #id " + this.id)

    }
}

fun main() {
    Customer.id = 2345;
    Customer.registerCustomer(); //no need to declare a object.
}
```

* A Object class cannot be inherited but it can inherit other class. `cannot inherit from singleton`

* The method of a parent class inherited by a object class can be used statically.

```
object Customer : CheckIn() {
    var id: Int = 1;//behaves like a static variable.

    fun registerCustomer() {
        //behaves like a static method.
        println("Customer registered #id " + this.id)

    }
}

open class CheckIn {
    init {
        println("Initialized")
    }
    fun mySuperClass(){
        println("From my super class");
    }
}

Customer.id = 2345;
Customer.registerCustomer(); //no need to declare a object.
Customer.mySuperClass();

```


* We can have `init` method inside the singleton but we cannot have a constructor.


### Companion Object
A Object class defined inside a class as companion. When a companion object is defined inside a class the object's property and method can be accessed as `static` members of the class. 
```

class MyCompClass {
    companion object CustomerData {
        var count: Int = 100

        fun printCount() {
            print("Count is $count");
        }
    }
}

fun main() {
    MyCompClass.printCount();
}

```


### Lazy Singleton
By creating a lazy singleton pattern inside a class you can create a instance quickly of a class constructor is not loaded by `lazy singleton` instantiation.

The lazy singleton pattern the object is created only once.

```

class LazySingleton {
    var name: String? = null;

    private constructor(){
        println("You instantiated the class")
    }

    companion object {
        val instance: LazySingleton by lazy { LazySingleton() }
    }
}

val ob1 = LazySingleton.instance;
ob1.name = "Tom";

val ob2 = LazySingleton.instance;
println(ob2.name) // prints tom

```

* Here the second initialization of class does not create a new instance but initializes the 1st created object. Hence the `ob2.name` outputs the same value of `ob1.name`





### High Level Function and Lambdas
* Lambdas is a function without name.

```
//Syntax...

val myLamb = (Int,Int) -> Int={x , y -> x + y}

variable_name = (arg1 type, arg2 type) -> return type = { arg1, arg2 -> body}

//The type declaration in lambda function are optional when passing it to a function.
```

* High level function can accept functions a parameters or can return a function or can do both.
```
    fun addTwoNumber(a:Int, b:Int, myFuncLamb: (Int, Int) -> Int)
```

* A lambda function is passed right after closing parenthesis of the function call.
```
    obj.addNumberWithLambda(2, 2) { s: Int,s: Int -> s + s }
```

* Access or modify the variable declared outside the lambda
```
    var result = 0;
    val myLmb = { x: Int, y: Int -> result = x + y }
    myLmb(2, 2);
    println(result)
```

* `it` is the name of the single parameter inside a lambda expression and is only applicable if you have only once parameter.

```

class ItKey {
    fun reverseString(str: String, myFunc: (String) -> String) {
        println(myFunc(str));
    }
}

fun main() {
    val obj = ItKey();
    obj.reverseString("Hello world") { it.reversed() };
    
}
```

* Making the object's property and method access easy with `lambda and with and apply keyword`

```

class WithApply {
    var name: String? = null;
    var age: Int = 0;
    var canSing: Boolean? = null;

    fun myFunc() {
        println("Check method..")
    }
}

fun main() {
    val obj = WithApply();
    with(obj) {
        name = "Selvesan"
        age = 20
        canSing = true
        myFunc();
    }    
    
    obj.apply {
        name = "James"
    }.myFunc();

}
```

**Below we have solved the problem using interface not by lambda the same problem is solved using lambda on the next step**

* Interface example below to implement a object oriented approach to solve a problem.
    
    * A interface with a abstract method.
        ```
        interface MyFunctionInterface {
            fun printSum(sum: Int);
        }
        ```

    * You can accept this interface in a method.
        ```
        class HighFunctionLambdas {
            fun addNumbers(a: Int, b: Int, prInt: MyFunctionInterface) {
                // here as a third argument you are accepting a interface and calling it's method
            }
        }
        ```
    
    * Now call the `addNumber` function and send the arguments. 
        ```
            val obj = HighFunctionLambdas();
            obj.addNumbers(2, 2, object : MyFunctionInterface {
                override fun printSum(sum: Int) {
                    println(sum);
                }
            });
        ```
    * **Note** here you are passing the interface with a function.


##### Now Using a Lambda 

```
// A function without a name.

val myLambda: (Int) -> Unit = { s: Int -> print(s) };
//Unit is a void data type in kotlin since the lambda does not return anything.

myLambda(2);
```

* Not passing the lambda to a High Level Function.
```
    
    fun addNumberWithLambda(a: Int, b: Int, printLmb: (Int) -> Unit) {
        val sum = a + b;
        printLmb(sum);
    }
    
    
    obj.addNumberWithLambda(2, 2) { s: Int -> println(s) }
   
```


### Nested Class
A Class inside a class.

```
class NestedClass {
    val name: String = "Selvesan"

    inner class ActualNestedClass {

        fun insideTheNest() {
            //this name property is only accessible once you declare the nested class with inner keyword
            println(name);
        }
    }
}

val obj = NestedClass();
val nestObj = obj.ActualNestedClass();
nestObj.insideTheNest();

```


### Enum

A Collection of information for comparison.

```
enum class Direction {
    NORTH, SOUTH, EAST, WEIGHT
}


fun main() {
    val userRedirection = Direction.SOUTH;
    if (userRedirection == Direction.SOUTH) {
        println("You are at south")
    }
}
    
```



### Generic Types
Another way to represent the data of a class. Sometimes i send a object or variable but i don't know the data type i use generate.

Generics can be defined in class or functions.

Here you can define the type for of the data that will be passed to the class.

* The above class is expecting an `int credit`
```
class UserAdmin(credit: Int) {
    init {
        println(credit)
    }
}
```
* We can never use the class like `var ua=UserAdmin("Selvesan");`

* The generics defined class can be used by passing any type.

```
//here the T is a Type representation which can be given as any type.
class UserAdmin<T>(credit: T) {
    init {
        println(credit)
    }
}
```

* Now use the class like this so that you can pass any data type.
```
    var uaInt = UserAdmin<Int>(20);
    var uaString = UserAdmin<String>("Selvesan");
```

* Can have multiple arguments with multiple type

```
class UserAdmin<T, X>(credit: T, age: X) {
    init {
        println(credit)
    }
}

```

* Can also be used in function.
```
fun <T> sort(data: T) {
    println(data)
}

sort<Int>(20);
sort<Float>(20.33f);
```

* Be more specific.
```
//Here the sort will take only number types i.e int or float or double
fun <T> sort(data: T) where T : Number, T : Comparable<T> {
    println(data)
}

sort<Int>(20);
sort<Float>(20.33f);
sort<String>("Ram");// will fail.
```

### Delegation 
**Dictionary Meaning (send or authorize (someone) to do something as a representative.)**  

Delegation is a way to override the function of a implemented interface but through some other class object that is received as an argument.

**Step wise understanding delegation.**

* A interface that has a property and method
```
interface CreditCard {
    val cardNumber: String;
    fun score(age: Int);
}

```

* This interface is implemented by two different classes.
```
class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        println("Master Card $age")
    }
}

class Visa(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        println("Visa Card $age");
    }
}
```

* Now creating another class which implements the concept of delegation.
```
class PayPal(client: CreditCard) : CreditCard by client {
    //Dictionay Meaning: send or authorize (someone) to do something as a representative.
    
}

```
* Here the class implements the interface but does not have to override the function of the interface as it is accepting the interface as it's argument. Now the argument supplied to this class should be a object of a class that has implemented the `CreditCard` interface.

```
1    val masterCardObj = MasterCard("1234");
    masterCardObj.score(20);

2    val visObj = Visa("1234567");
    visObj.score(20);


    //now calling the function with a delegation
3    val payPalObj = PayPal(visObj);//delegated a Visa
    payPalObj.score(32);//Visa Card 32 card no: 1234567


4    val payPalObj2 = PayPal(masterCardObj);//delegated a Visa
    payPalObj2.score(54);//Master Card 54 card no: 1234
```


* 3 and 4 are the delegation class instance which accepts the object of the classes that have implemented the interface.


### Comparable (Sorting Objects)
A Object is not comparable by default but you can make them comparable with the help of `Comparable` class provided by Kotlin.

The Comparable class has a method that has to be overridden by the child class `compareTo` and the comparison is done on the basis of the returned value by this function.



**Comparable to sort object.**
```
class CompareA(val name: String, val age: Int) : Comparable<CompareA> {
    override fun compareTo(other: CompareA): Int {
        return this.age - other.age;
    }
}

val listOfObj = ArrayList<CompareA>();
listOfObj.add(CompareA("Ram", 30))
listOfObj.add(CompareA("Shyam", 20))
listOfObj.add(CompareA("Gopal", 50))

//this sort will not be possible if there was no comparable implemented.
listOfObj.sort();
for (user in listOfObj) {
    println("${user.name}, ${user.age}")
}

```
 
 
### Casting
Create a instance of a class and convert it to the instance of some other class. 

* For casting to happen the casted class must be a child of the class it is being casted to.

```
open class Casting {
    fun check() {
        println("Hello from Casting class")
    }

    fun hey() {
        println("Hey from Casting class")
    }
}

class ExampleClass : Casting() {
    fun one() {
        println("Hello from one")
    }

    fun two() {
        println("Hello from two")
    }
}

val obj = ExampleClass() as Casting;
obj.check();
```

* Once the casting is done the `ExampleClass` object will have no access to it's `one()` and `two()` method



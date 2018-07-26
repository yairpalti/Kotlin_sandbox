
// More on https://freecontent.manning.com/declaring-higher-order-functions/

//fun square(a: Int) = a * a
fun square(a: Int): Int {
    println ("square")
    return a*a
}
fun square2(a: Int): Unit {
    println ("square2")
}
fun square3(a: Unit) {
    println ("square3")
}
object MyObject {
    fun example3(transform: (Unit)->Unit) {
        println("MyObject:example3")
        transform(Unit)
        println("End of MyObject:example3")
    }
}
class MyClass {
    var myNumber:Int = 0
    fun send() {
        example3 { callback(Unit) }
        MyObject.example3 {callback(Unit)}
    }
    private fun callback(a: Unit) {
        println ("myClass:callback: myNumber = $myNumber")
    }
}
fun minusOne(a: Int) = a-1
//fun lessThan2(x: Int):Boolean = x<2

//fun example(transform: (x:Int)->Int) = println (transform(5))
fun example(transform: (x:Int)->Int) {
    println("example")
    println (transform(5))
}

fun example2(transform: (x:Int)->Unit) {
    println("example2")
    println (transform(7))
}
fun example3(transform: (Unit)->Unit) {
    println("example3")
    transform(Unit)
    println("End of example3")
}
fun isOdd(x: Int) = x % 2 != 0
fun isNotNull(x:Int) = x!=null // there actually is a filterNotNull extension function for this common use case
fun isPositive(x: Int)=x>0
fun isNegative(x: Int)=x>0
fun isValidMonth(x:Int) = x in 1..12

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun callCallback(callback: (x:Int) -> Unit) {
    callback(7)
}

fun myCallback(num:Int) {
    println("myCallback: $num")

}



fun main(args:Array<String>) {
    example { square(10) }
    example { minusOne(9) }
    var list = ArrayList<Int>(4)
    list.add(1)
    list.add(3)
    list.add(0)
    list.add(5)

    val lessThan2:(Int)->Boolean = {x -> x<2}
    val filteredList =list.filter (lessThan2)
    println("filtered list:$filteredList")

    val numbers = listOf(1, 2, 3)
    println("numbers ${numbers.filter(::isOdd)}") // prints [1, 3]

    val month = listOf(1, 2, 3, 10, 40, -4, -2, 0)
    println("month ${month.filter(::isValidMonth).filter(::isPositive)}")

    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }

    example2 { square2(10) }
    example3 { square3(Unit) }

    println("*****Class - passing function class as parameters calls correctly the instance method ******")
    println("**myClass1 **")

    val myClass1 = MyClass()
    myClass1.myNumber = 1
    myClass1.send()
    println("**myClass2 **")

    val myClass2 = MyClass()
    myClass2.myNumber = 2
    myClass2.send()
//    callCallback (myCallback(5))

}




// More on https://freecontent.manning.com/declaring-higher-order-functions/

fun square(a: Int) = a * a
fun minusOne(a: Int) = a-1
//fun lessThan2(x: Int):Boolean = x<2

fun example(transform: (x:Int)->Int) = println (transform(5))
fun isOdd(x: Int) = x % 2 != 0
fun isNotNull(x:Int) = x!=null // there actually is a filterNotNull extension function for this common use case
fun isPositive(x: Int)=x>0
fun isNegative(x: Int)=x>0
fun isValidMonth(x:Int) = x in 1..12

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
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

}



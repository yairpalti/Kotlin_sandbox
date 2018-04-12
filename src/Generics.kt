/*
https://kotlinlang.org/docs/reference/generics.html
 */

// Generic class
class Counter<T>(t:T) {
    var count = t
    fun printCount() {
        println("Count:$count")
    }
}

class TwoCounter<T,E>(var count:T,inputData:E) {  // count is properties & input parameter, inputData is only input parameter
    var countData = inputData
    init {
        println(count)
        println(countData)
    }
    fun printCount() {
        println(count)
    }
}

// Generic function
fun <T> display(t:T) {
    println(t)
}

fun main(args:Array<String>) {
    var count = Counter<String> ("5")
    count.printCount()

    var count1 = Counter("5") // "5" has type String, so the compiler figures out that we are talking about Counter<String>
    count1.printCount()


    var count2 = Counter<Int> (5)
    count2.printCount()

    var twoCounter = TwoCounter<String, Int> ("5", 7)

    display(55)
    display<String>("text")
}
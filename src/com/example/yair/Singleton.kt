package com.example.yair
object SomeSingleton {
    init {
        println("init complete")
    }
}

object Counter  {
    init {
        println("init complete")
    }
   var count:Int=0
    fun plus() {
        count++
    }
    fun display() {
        println(count)
    }
}

fun main(args:Array<String>) {
    var counter = Counter
    for (i in 0..9)
        counter.plus()
    print("counter: ")
    counter.display()
    var counter2 = Counter
    print("counter2: ")
    counter2.display()
    print("without instance: ")
    Counter.display()
}
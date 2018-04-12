package com.example.yair

class Outer {
    var name:String?=null
    class Nested {
        fun display() {
            println("nested")
//            println(name) // Can't use
        }
    }
    inner class Inner {
        var innerName:String?=null
        fun display() {
            println("\ninner")
            println(name)
            println(innerName)
        }
    }
}

fun main(args:Array<String>) {
    var outer = Outer()
    outer.name = "yair"
    var nested = Outer.Nested()
    nested.display()
    // new instance of Outer
    var inner1 = Outer().Inner()
    inner1.innerName = "innerName"
    inner1.display()
    //
    var inner2 = outer.Inner()
    inner2.innerName = "innerName2"
    inner2.display()

    var inner3 = outer.Inner() // new Inner instance to the same outer instance
    inner3.display()

}
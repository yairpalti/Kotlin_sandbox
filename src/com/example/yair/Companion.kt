package com.example.yair

/*
Here we are accessing the class, sleeping for 1 second, and then accessing ObjectTest.

This will output: Companion Object Init

Then after a second: Object Init Object Method

Conclusion:
We can see that while they are similar, they have some pretty big differences.
companion object has these characteristics:
Unable to stand by itself
Is loaded with the class

object has these characteristics:
Able to stand by itself
Can be used as an expression
Used for anonymous inner class equivalent
Lazy


A companion object is not part of an instance of a class. You can't access members from a companion object, just like in Java you can't access members from a static method.

Instead, don't use a companion object:
 */
fun main(args: Array<String>){
    PersonA.myName = "yair"
    PersonA.callMe()
    Test.hashCode()
    Thread.sleep(1000)
    Test.ObjectTest.objectMethod()

}

class PersonA (var name:String="yair") {
    var aaa:Int = 5
    fun getName1():String {return name}
    fun getDefaultName():String { return "ccc"}
    // name of the companion object is omitted
    companion object {
        var myName:String = "aaa"
        fun callMe() = println("I'm called. - $myName")
    }
}

class Test {
    companion object CompanionObjectTest {
        init{
            println("Companion Object Init")
        }
        fun objectMethod(){
            println("Companion Object Method")
        }
    }

    object ObjectTest {
        init{
            println("Object Init")
        }
        fun objectMethod(){
            println("Object Method")
        }
    }
}
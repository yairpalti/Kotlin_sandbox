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
 */
fun main(args: Array<String>){
    Test.hashCode()
    Thread.sleep(1000)
    Test.ObjectTest.objectMethod()

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
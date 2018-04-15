package com.example.yair

fun main (args:Array<String>) {
    val t1 = MyThread("first")
    t1.start()
    val t2 = MyThread("second")
    t2.start()
    println("main thread")
    val t3 = MyThread("third")
    t3.start()
    t3.join() // wait here till t3 thread is done
    println("main thread after join")
}
class MyThread(var threadName:String):Thread() {
    override fun run() {
        super.run()
        var count:Int = 0
        while (count<10) {
            println("$threadName - Count: $count")
            count++
            try {
                Thread.sleep(500)
            } catch (ex:Exception) {
                println(ex.message)
            }
        }
    }
}
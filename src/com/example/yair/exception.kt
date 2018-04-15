package com.example.yair

fun main(args:Array<String>) {
    try {
        val t:Int = readLine()!!.toInt()
        val div:Int = 10/t
        println(div)
    } catch (ex:Exception) {
        println(ex.message)
    }
    println("Done")


}
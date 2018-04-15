package com.example.yair

import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>) {
    var str:String = readLine().toString()
    writeToFile(str)
    println("\n\n")
    readFromFile()
}

fun readFromFile() {
    try {
      var fi = FileReader("testFile")
        var c:Int?
        do {
            c = fi.read()
            print(c.toChar())
        } while (c!=-1)
    } catch (ex:Exception) {
        println(ex.message)
    }

}
fun writeToFile(str:String) {
    try {
        var fw = FileWriter("testFile",true)
        fw.write(str+ "\n")
        fw.close()
    } catch (ex:Exception) {
        println(ex.message)
    }
}
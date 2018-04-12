package com.example.yair

import java.awt.print.Printable
import java.util.*

class Person (var name:String, var age:Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }

}

fun main(args:Array<String>) {
    var listOfNames = ArrayList<String> ()
    listOfNames.add("rrr")
    listOfNames.add("aaa")
    listOfNames.add("ddd")
    listOfNames.add("eee")
    listOfNames.add("bbb")

    println ("before sort")
    println (listOfNames)
    println ("after sort")
    Collections.sort(listOfNames)
//    listOfNames.sort() // same as Collections.sort(listOfNames)
    println (listOfNames)

    var listOfPersons = ArrayList<Person> ()
    listOfPersons.add(Person( "rrr", 15) )
    listOfPersons.add(Person("aaa", 78))
    listOfPersons.add(Person("ddd",54))
    listOfPersons.add(Person("eee",12))
    listOfPersons.add(Person("bbb",13))

    println ("before sort")
    for (i in listOfPersons) {
        println("name: ${i.name} age: ${i.age}")
    }
//    println (listOfPersons)
    println ("after sort")
    Collections.sort(listOfPersons)
    for (i in listOfPersons) {
        println("name: ${i.name} age: ${i.age}")
    }
//    println (listOfPersons)



}
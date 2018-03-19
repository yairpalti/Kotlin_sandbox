import java.time.Year
import java.util.*

fun main (args:Array<String>) {
    println("enter your birth year")
    var dob:Int? = readLine()?.toIntOrNull()
    var currYear =  Calendar.getInstance().get(Calendar.YEAR)
    var aaa = (dob == 5)
    if (dob != null) {
        var age = currYear - dob
        println("age is $age years")
    }
    when (dob) {
        in 1000..2000 -> {
            println ("input is 2000")
        }
        in 30001..3000 -> {

        }
        else -> {
            println ("else")
        }
    }
    loop@ for (i in 1..10) {
        println ("I $i")
        if (i == 5)
            break@loop
    }
    while (dob!! > 2050) {
       --dob
    }
    println ("dob = $dob")

}
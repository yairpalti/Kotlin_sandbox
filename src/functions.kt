
fun sum (elem1:Double, elem2:Double):Double {
    return elem1+elem2
}

fun interSum (elem1:Double, elem2:Double):Unit {
    println (elem1+elem2)
}
fun sum2 (elem1:Double, elem2:Double) = elem1+elem2
fun sum3 (elem1:Double, elem2:Double=4.0) = elem1+elem2
fun main(args:Array<String>) {
    var sum = sum(3.0,5.0)
    println ("sum: $sum")
    interSum (7.0,2.0)
    println (sum2 (6.3,4.4))
    println (sum3 (6.3))

}
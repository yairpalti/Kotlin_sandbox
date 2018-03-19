fun main(args:Array<String>) {
    var x:Int?=5;
    var y=3;
    var name:String?="42"
//    name = readLine()
    var age:Int? = 1;
    var ddd:Int?
    age = null
    ddd = null
//    name = null
    age = name?.toInt()

    if (ddd == null) {
        x = name?.length
        var yy = name?.length ?: 0
        var rr = name?: 0
        println (x)
        println (yy)
        println ("name: " + rr + "\n")
        println ("name2: " + name ?: 0)
        println (age)
    }
    var n1:Float =  readLine()!!.toFloat()
    println ()
    var n2 =  readLine()!!.toFloat();
    var n3= n1+n2
    println ("sun:$n3")


}
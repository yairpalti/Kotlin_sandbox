open class ClassInheritance {
    var ProcessName:String?=null
    protected var name2:String?=null
    private var name3:String?=null

    fun sum (n1: Int, n2: Int): Int {
        return n1+n2
    }
    fun div (n1: Int, n2: Int): Int {
        return n1/n2
    }
    open fun mul (n1: Int, n2:Int): Int {
       return n1*n2
    }
}

class MultiOperations: ClassInheritance() {
    var multi:Int?=null
    override fun mul (n1: Int, n2:Int): Int {
        this.multi =5
        multi = 6
        name2 = "aaa"
        super.ProcessName = "bbb"
        return n1*n2*3
    }
    fun sub (n1: Int, n2: Int): Int {
        return n1-n2
    }
    fun getName ():String {
        return super.ProcessName!!
    }
    fun getMyName():String {
//        name3
        return super.name2!!
    }
}

open class Base {
    open fun myPrint() {
        println("Base")
    }
}
class Derived:Base {
    constructor(): super(){
    }

    override fun myPrint() {
        println("Derived")
    }
    fun onlyInDerived() {
        println("onlyInDerived")
    }
}

fun main(args:Array<String>) {
    var op = ClassInheritance()
    var sum = op.sum(5,3)
    println("sum:$sum")
    var div = op.div(10,2)
    println("div:$div")

    // Inheritance
    var op2 = MultiOperations()
    op2.ProcessName = "yair"
    var sum2 = op2.sum(5,3)
    println("sum:$sum2")
    var div2 = op2.div(10,2)
    println("div:$div2")
    println("name:${op2.ProcessName}")
    println("name:${op2.getName()}")
//    println(${op2.name2})
//    println(${op2.name3})
    println("mul:${op2.mul(2,3)}")

    //Casting
    var op3 = MultiOperations() as ClassInheritance
    op3.ProcessName = "yair"
    var sum3 = op3.sum(5,3)
    println("sum:$sum3")
    var div3 = op3.div(10,  2)
    println("div:$div3")
    println("name:${op3.ProcessName}")
//    println("name:${op3.getName()}")
//    println(${op2.name2})
//    println(${op2.name3})
    var mul = op3.mul(2,3)
    println("cast mul:$mul")
    println("ProcessName:${op3.ProcessName}")

    //
    var base = Base()
    var derived = Derived()
    var cast = Derived() as Base

    print("\n")
    base.myPrint()
    derived.myPrint()
    cast.myPrint()
    (cast as Derived).onlyInDerived()

}
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
}

class MultiOperations:ClassInheritance() {
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
fun main(args:Array<String>) {
    var op = ClassInheritance()
    var sum = op.sum(5,3)
    println("sum:$sum")
    var div = op.div(10,2)
    println("div:$div")

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

}
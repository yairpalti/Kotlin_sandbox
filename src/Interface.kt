// Interface

interface Op { // all fun are open by default
    var data:Int // abstract
    fun sum(n1:Int, n2:Int); // abstract by default
    fun div(n1:Int, n2:Int) { println("default implementation")}
}
class UserOp:Op {
    override var data: Int = 0
    override fun sum(n1: Int, n2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun div(n1: Int, n2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
class AdminOp(override var data: Int) :Op {
    override fun sum(n1: Int, n2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
//
//
// Abstract Class
abstract class Credit() {
    var amount:Int?=null
    abstract var id:Int // inherent class must implement
    fun getCredit():String {
       return "1234"
    }
    abstract fun newCredit() // inherent class must implement
}
class UserCredit(/*override var id: Int*/):Credit(){
    constructor(i: Int) : this() { // Second constructor
        id = i
    }

    override var id:Int = 0
    fun getInfo():String {
        return getCredit()
    }

    override fun newCredit() {
        println("new credit:$amount")
    }
}
fun main (args:Array<String>) {
//    var credit = Credit() // can't create instance from abstract class
    var userCredit = UserCredit(4)
    userCredit.amount = 5
    userCredit.id = 6
    println("${userCredit.getCredit()}")
    userCredit.newCredit()
    println("ID: ${userCredit.id}")

}
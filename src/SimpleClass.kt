class Car(type:String) {
    init {
//        type = "ff"  //val can't be assigned
        println ("Car is created: $type")
    }
}

class house(var street:String, var number:Int, var city:String) {
//    fun getStreet():String {
//        return street
//    }
fun getPrice(): Int {
    var price: Int = if (street.compareTo("abc") == 0) 10000 else 3
    return price
}
}

class building() {
    var street:String?=null;
    var number:Int?=null
    var city:String?=null
    constructor(street:String, number:Int,  city:String) {
        this.street = street
        this.street = street
        this.street = street

    }
    fun getPrice(): Int {
        var price: Int = if (street.compareTo("abc") == 0) 10000 else 3
        return price
    }
}

fun main(args:Array<String>) {
    val firstCar = Car("AAA")
    val secondCar = Car("BBB")
    val myHouse = house("abc", 4, "Paris")
    println("house: ${myHouse.street} ${myHouse.number} ${myHouse.city}")
    println(myHouse.getPrice())
}
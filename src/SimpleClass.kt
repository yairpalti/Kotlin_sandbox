class Car(var type:String) {

    init {
//        type = "ff"  //val can't be assigned
        println ("Car is created: $type")
    }
    constructor(car: Car) : this(car.type) // copy constructor

}

class House(var street:String?=null, var number:Int, var city:String) {
    //    fun getStreet():String {
//        return street
//    }
    fun getPrice(): Int {
        var price: Int = 0
        if (street != null) {
            price = if (street!!.compareTo("abc") == 0) 10000 else 3
        }
        return price
    }
}

class Building() {
    var street:String?=null
    var number:Int?=null
    var city:String?=null
  /*  constructor(street:String, number:Int,  city:String) {
        this.street = street
        this.number = number
        this.city = city

    }*/
    fun getPrice(): Int {
        var price: Int = if (street!!.compareTo("abc") == 0) 10000 else 3
        return price
    }
}

fun main(args:Array<String>) {
    val firstCar = Car("AAA")
    var secondCar = Car("BBB")
    val thirdCar = Car(firstCar) // copy constructor
    val myHouse = House("abc", 4, "Paris")
    val myHouse2 = House( number=4, city="Paris")
    println("house: ${myHouse.street} ${myHouse.number} ${myHouse.city}")
    println(myHouse.getPrice())
    println("house2: ${myHouse2.street} ${myHouse2.number} ${myHouse2.city}")
    println(myHouse2.getPrice())


    // classes
    secondCar.type = firstCar.type
    firstCar.type = "ccc"

    println("firstCar.type: ${firstCar.type}")
    println("secondCar.type: ${secondCar.type}")


    secondCar = firstCar
    firstCar.type = "type changed after assignment"
    println("firstCar.type: ${firstCar.type}")
    println("secondCar.type: ${secondCar.type}")

    // primitives
    var a:Int = 5
    var b:Int = 7
    println ("\nbefore    -     a:$a, b:$b")
    b = a
    println ("after assignment     -     a:$a, b:$b")
    a = 9
    println ("after change of a     -     a:$a, b:$b")

    var aStr:String = "5"
    var bStr:String = "7"
    println ("before    -     aStr:$aStr, bStr:$bStr")
    bStr = aStr
    println ("after assignment     -     aStr:$aStr, bStr:$bStr")
    aStr = "9"
    println ("after change of aStr     -     aStr:$aStr, bStr:$bStr")





}
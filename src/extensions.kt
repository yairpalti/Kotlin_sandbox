import com.example.yair.ClassFromOtherPackage
//import com.example.yair.*

fun <E> ArrayList<E>.swap(index1: Int, index2: Int) {
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(args:Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("aaa")
    arrayList.add("bbb")
    arrayList.add("ccc")
    arrayList.add("ddd")
    arrayList.swap(1,2)
    println(arrayList)

    var classFromOtherPackage = ClassFromOtherPackage()
}


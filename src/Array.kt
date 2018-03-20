fun main(args:Array<String>) {
    var arrInt = Array<Int> (10) {0}
    println("arrInt[3] " + arrInt[3])
    // by index
    for (i in 0..9)
        arrInt[i] = i
    // by object
    for (elm in arrInt) {
        println(elm)
    }
    var arrList = ArrayList<String> ()
    arrList.add("a")
    arrList.add("b")
    arrList.add("c")
    arrList.add("d")
    arrList.add("e")
    println ("first: " + arrList.get(0))
    println ("all: ")
    // by object
    for (item in arrList)
        print (" " + item)
    if (arrList.contains("d"))
        println("\nfound")
    else
        println("not found")
    // index
    for (index in 0..arrList.size-1) {
        println (arrList[index])
    }

}
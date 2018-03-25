fun main(args:Array<String>) {
    var map = hashMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4,"d")
    println (map[3])
    println (map.get(3)+ "\n")

    var arr = arrayListOf(1,2,3,4)
    var list = mutableListOf(1,2,3)
    list[2] = 4
    arr[2] = 5
    var size = arr.size
    if (arr.isEmpty())
        println ("empty")
    else {
        println(arr[2]);
        println(size)
    }
    println ("list: $list")

}
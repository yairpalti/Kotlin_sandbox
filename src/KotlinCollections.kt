fun main(args:Array<String>) {
    var map = hashMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4,"d")
    println (map[3])
    println (map.get(3)+ "\n")

    var arr = arrayListOf(1,2,3,4)
    var size = arr.size
    if (arr.isEmpty())
        println ("empty")
    else {
        println(arr[2]);
        println(size)
    }

}
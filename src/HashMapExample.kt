fun main (args:Array<String>) {
    var map = HashMap<Int, String>()
    map.put(1, "a")
    map.put(2, "b")
    map.put(3, "c")
    map.put(4, "d")
    println(map.get(3))
    map.put(3, "z")
    for (k in map.keys)
        println (map.get(k))
}
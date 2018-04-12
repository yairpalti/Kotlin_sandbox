/*
    https://blog.kotlin-academy.com/kotlin-programmer-dictionary-field-vs-property-30ab7ef70531

    https://kotlinlang.org/docs/reference/properties.html
    
    This is an example of a Java field:
        public String name = "Marcin";
    Here is an example of a Kotlin property:
        var name: String = "Marcin"
They both look very similar, but these are two different concepts.
Direct Java equivalent of above Kotlin property is following:

private String name = "Marcin";
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
 */

class Person() {
    var name:String?=null
    set(value) {
        if (!value.isNullOrBlank()){
            field = value
        }
        name4 = "set by name setter"
    }
    get() {
        if (!field.isNullOrBlank())
          return field!!.capitalize()
        else
            return field
    }
    var name2:String?=null // default setter & getter
    var name3:String?=null
        set(value) {
            if (!value.isNullOrBlank()) name3 = value // !!! this doesn't allowed as this is a recursive call to set
        }
    private var name4:String?=null
        set(value) {
            if (!value.isNullOrBlank()){
                field = value
            }
        }
    fun getName4(): String? {
        return name4
    }
}
fun main(args:Array<String>) {
    var person = Person()
    person.name = "aaa" // customized set
    person.name = null
    person.name = ""
    println("name: ${person.name}") // customized get

    person.name2 = "aaa" // default set
    person.name2 = null
    person.name2 = ""
    println("name2: ${person.name2}") // default get

//    person.name3 = "bbb"
    println ("name4:${person.getName4()}")
}
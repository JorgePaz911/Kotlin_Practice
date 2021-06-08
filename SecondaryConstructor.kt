

/**
 * only secondary constructor
 */
class Test{

    constructor(id: Int){
        println("First: $id")
    }

    constructor(name: String){
        println("Second: $name")
    }

}

/**
 * Both primary and secondary constructors
 */
class Both(var id: Int, var name: String){

    constructor(id: Int, name: String, age: Int): this(id, name){
        println("id: $id and name: $name and age: $age")
    }

}


fun main(){
//    var test1 = Test(10)
//    var test2 = Test("Hello")

    var both = Both(4, "hello")
}
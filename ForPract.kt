

fun main(){

    //simpleFor()
    //numFor()
    //rangeFor()
    //rangeDownFor()
    rangeWithStep()
}

fun rangeWithStep(){
    for(i in 1..10 step 2){
        println(i)
    }
}

fun rangeDownFor(){
    for(i in 5 downTo 1){
        println(i)
    }
}

fun rangeFor(){
    for (i in 1..5){
        println(i)
    }
}

fun numFor(){
    println("Numbers:")
    var numbers = arrayOf(1,2,3,4)
    for(number in numbers){
        println(number)
    }
}

fun simpleFor(){
    println("Names:")
    var names = arrayOf("a", "b", "c")
    for(name in names){
        println(name)
    }
}
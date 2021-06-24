

fun main(){

    //firstWhen(7)
    //println(secWhen(7))
    //whenMultipleStatements(5)
    //println(whenOddEven(54))
    //whenMultipleOptions(8)
    whenRange(8)
}

fun firstWhen(num: Int){
    when(num){
        5 -> println("num is $num")
        6 -> println("num is $num")
        else -> println("num is $num, not 5 or 6")
    }
}

fun secWhen(num: Int): String{

    var str = when(num) {
        5 -> "num is $num"
        6 -> "num is $num"
        else -> "num is $num, not 5 or 6"
    }
    return str
}

fun whenMultipleStatements(num: Int){
    when(num){
        5 -> {
            println("-------------")
            println("nums is $num")
            println("-------------")
        }
        6 -> {
            println("-------------")
            println("nums is $num")
            println("-------------")
        }
        else ->{
            println("-------------")
            println("nums is $num, not 5 or 6")
            println("-------------")
        }
    }
}

fun whenOddEven(num: Int): String{
    var num2 = num % 2
    return when(num2){
        0 -> "even"
        1 -> "odd"
        else -> "Nope"
    }
}

fun whenMultipleOptions(num: Int){
    when(num){
        1,2,3,4,5 -> println("$num is 1-5")
        6,7,8,9,10 -> println("$num is 6-10")
    }
}

fun whenRange(num: Int){
    when(num){
        in 1..5 -> println("$num is 1-5")
        in 6..10 -> println("$num is 6-10")
    }
}
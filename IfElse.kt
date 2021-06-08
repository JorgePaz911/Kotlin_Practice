

fun main(){
    ifElse(6)
    println(ifElseExpression(1))
}

fun ifElse(a: Int){

    if(a >= 5)
        println("$a >= 5")
    else
        println("$a < 5")
}

fun ifElseExpression(num: Int): String{

    var result = if(num == 10)
        "$num is equal to 10"
    else if (num > 10)
        "$num is greater than 10"
    else
        "$num is less than 10"
    return result

}
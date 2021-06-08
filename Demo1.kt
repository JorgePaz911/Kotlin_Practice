
fun main(){
    var a = "Hello World!!"
    var b = 10
    b += 5
    b.toByte()
    println("$a $b")


    var str: String
    str = "Yo Yo"
    println(str)
    println("First print: $a second print $str")


    var strNum = "10"
    var numNum: Int = strNum.toInt()
    numNum += 1
    println(numNum)


    practice1("Jorge")


    addNums(10,20)
}


fun practice1(a: String){
    println("The String is: $a")
}

fun addNums(a: Int, b: Int){
    println("this is the sum ${a + b}")
}
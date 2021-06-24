class Calculator {

    var num1: Int = 0
    var num2: Int = 0

    fun add(){
        println(num1 + num2)
    }

    fun sub(){
        println(num1 - num2)
    }

    fun mult(){
        println(num1 * num2)
    }

    fun div(){
        println(num1 / num2)
    }
}


fun main(){
    var calc = Calculator()

    calc.num1 = 50
    calc.num2 = 10

    calc.add()
    calc.sub()
    calc.mult()
    calc.div()
}
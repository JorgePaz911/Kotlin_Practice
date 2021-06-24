import kotlin.math.ln

class Employee (fName: String, lName: String){

    var fName = ""
    var lName = ""

    init {
        this.fName = fName
        this.lName = lName
    }

    fun getFullName(){
        println("Full Name: $fName $lName")
    }

}

fun main(){
    var emp = Employee("Jorge", "Paz")
    emp.getFullName()
}